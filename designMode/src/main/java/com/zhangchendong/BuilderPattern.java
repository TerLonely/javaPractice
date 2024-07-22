
package com.zhangchendong;

import lombok.Data;

/**
 * 建造者模式
 * @author zhangchendong
 * @data 2024/7/19 上午11:55
 */
public class BuilderPattern {

    @Data
    static class House{
        private String foundation;
        private String structure;
        private String roof;
        private String interior;
    }

    static abstract class HouseBuilder{
        protected House house = new House();

        public abstract void buildFoundation();

        public abstract void buildStructure();

        public abstract void buildRoof();

        public abstract void buildInterior();

        public House getHouse(){
            return house;
        }
    }

    static class ConcreteHouseBuilder extends HouseBuilder{
        @Override
        public void buildFoundation() {
            house.setFoundation("buildFoundation");
        }
        @Override
        public void buildStructure() {
            house.setStructure("buildStructure");
        }
        @Override
        public void buildRoof() {
            house.setRoof("buildRoof");
        }
        @Override
        public void buildInterior() {
            house.setInterior("buildInterior");
        }
    }

    static class LuxuryHouseBuilder extends HouseBuilder{
        @Override
        public void buildFoundation() {
            house.setFoundation("Strong Foundation");
        }

        @Override
        public void buildStructure() {
            house.setStructure("Reinforced Structure");
        }

        @Override
        public void buildRoof() {
            house.setRoof("Elegant Root");
        }

        @Override
        public void buildInterior() {
            house.setInterior("Luxury Interior");
        }
    }

    static class Director{
        private HouseBuilder builder;

        public Director(HouseBuilder builder){
            this.builder = builder;
        }

        public House constructHouse(){
            builder.buildFoundation();
            builder.buildStructure();
            builder.buildRoof();
            builder.buildInterior();
            return builder.getHouse();
        }
    }

    public static void main(String[] args) {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        Director concreteDirector = new Director(concreteHouseBuilder);
        House concreteHouse = concreteDirector.constructHouse();
        System.out.println("Concreted House:" + concreteHouse);

        HouseBuilder luxuryHouseBuilder = new LuxuryHouseBuilder();
        Director luxuryDirector = new Director(luxuryHouseBuilder);
        House luxuryHouse = luxuryDirector.constructHouse();
        System.out.println("Luxury House:" + luxuryHouse);
    }
}
