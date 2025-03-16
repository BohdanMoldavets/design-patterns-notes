package org.moldavets.model;

public class Car {
    private String brand;
    private String model;
    private Integer year;
    private String color;
    private Integer hp;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.hp = builder.hp;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public Integer getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", hp=" + hp +
                '}';
    }

    public static class Builder {
        private String brand;
        private String model;
        private Integer year;
        private String color;
        private Integer hp;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder hp(Integer hp) {
            this.hp = hp;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
