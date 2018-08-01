package com.company.Model;

public class Animal {


    private String name;
    private float weight;
    private float height;
    private String type;
    private String moving;
    private String family;

    public Animal(String type, String family, String name, float weight, float height, String moving) {
        this.type = type;
        this.family = family;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.moving = moving;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoving() {
        return moving;
    }

    public void setMoving(String moving) {
        this.moving = moving;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return type+" "+family+" "+name+" "+weight+" "+height+" " +moving;
    }
}
