package com.zhangchendong;

import java.util.ArrayList;
import java.util.List;

/** 迭代器模式
 *
 * @author zhangchendong
 * @data 2024/8/2 上午9:40
 */
public class IteratorPattern {
    public static void main(String[] args) {
        ConcreteCollection<String> collection = new ConcreteCollection<>();
        collection.addItem("Item 1");
        collection.addItem("Item 2");
        collection.addItem("Item 3");

        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

interface IterableCollection<T>{
    Iterator<T> createIterator();
}

// 具体的集合类实现可迭代的集合接口
class ConcreteCollection<T> implements IterableCollection<T>{

    private List<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}

//定义迭代器接口
interface Iterator<T>{
    Boolean hasNext();
    T next();
}

//具体迭代器实现的迭代接口
class ConcreteIterator<T> implements Iterator<T>{

    private List<T> items;
    private int position;

    public ConcreteIterator(List<T> items){
        this.items = items;
    }

    @Override
    public Boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
       if(hasNext()){
           T item = items.get(position);
           position++;
           return item;
       }
       throw new IndexOutOfBoundsException("No more elements");
    }
}
