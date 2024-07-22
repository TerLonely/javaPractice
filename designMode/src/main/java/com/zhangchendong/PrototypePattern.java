
package com.zhangchendong;

import lombok.Data;

/**
 * 原型模式
 * @author zhangchendong
 * @data 2024/7/22 上午10:47
 */
public class PrototypePattern {

    @Data
    static class Shape implements Cloneable{
        private String type;
        public Shape(String type){this.type = type;}
        @Override
        public Shape clone(){
            try {
                return (Shape) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Shape circle = new Shape("Circle");
        Shape cloneCircle = circle.clone();
        cloneCircle.setType("Cloned Circle");

        System.out.println("original Shape Type: " + circle.getType());
        System.out.println("Cloned Shape Type: " + cloneCircle.getType());
    }


}
