
package com.zhangchendong;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合设计模式
 * @author zhangchendong
 * @data 2024/7/24 下午1:48
 */
public class CompositePattern {

    public static void main(String[] args) {
        //创建 文件和文件目录
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        //子目录
        DirectoryComponent subDirectory = new DirectoryComponent("subDirectory");
        subDirectory.addComponent(file1);
        subDirectory.addComponent(file2);

        //根目录
        DirectoryComponent rootDirectory = new DirectoryComponent("rootDirectory");
        rootDirectory.addComponent(subDirectory);

        //展示文件结构
        rootDirectory.displayInfo();
    }
}

/**
 * 组件接口
 */
interface FileSystemComponent{
    void displayInfo();
}

/**
 * 叶子节点
 */
class File implements FileSystemComponent{
    private String name;

    public File(String name){
        this.name = name;
    }
    @Override
    public void displayInfo() {
        System.out.println("File: " + name);
    }
}

/**
 * 容器节点
 */
class DirectoryComponent implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components;

    public DirectoryComponent(String name){
        this.name = name;
        components = new ArrayList<>();
    }
    public void addComponent(FileSystemComponent component){
        components.add(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("directory:" + name);
        for(FileSystemComponent component : components){
            component.displayInfo();
        }
    }
}