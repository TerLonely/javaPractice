
package com.zhangchendong;

/**
 * 装饰器模式
 * @author zhangchendong
 * @data 2024/7/24 下午3:09
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.cost());
        //
        // Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        // System.out.println("Cost: " + milkCoffee.cost());
        //
        // Coffee sugarCoffee = new SugarDecorator(milkCoffee);
        // System.out.println("Cost: " + sugarCoffee.cost());

        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Cost: " + sugarMilkCoffee.cost());
    }
}

/**
 * 定义一个咖啡接口
 */
interface Coffee{
    Double cost();
    String description();
}

class SimpleCoffee implements Coffee{
    @Override
    public Double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}

/**
 * 创建装饰器抽象类
 */
abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public Double cost() {
        return coffee.cost();
    }

    @Override
    public String description() {
        return coffee.description();
    }
}

/**
 * 实现具体的装饰器 类
 */

class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator (Coffee coffee){
        super(coffee);
    }

    @Override
    public Double cost() {
        return super.cost() + 1.0;
    }

    @Override
    public String description(){
        return super.description() + ", with Milk";
    }
}

class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee){
        super (coffee);
    }
    @Override
    public Double cost(){
        return super.cost() + 0.5;
    }
    @Override
    public String description(){
        return super.description() + ", with Sugar";
    }
}



