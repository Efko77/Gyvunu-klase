package com.company.AnimalData;

import com.company.Interfaces.InterfaceGetData;

import java.util.Scanner;

public class Animal {

    private static InterfaceGetData data;

    public Animal(Animal spider) {

    }

    public static  InterfaceGetData getData(){
        return  data;
    }


    private String name;
    private float weight;
    private float height;
    private String type;
    private String moving;
    private String family;

    //public Animal() {

    //}
    public Animal(String type, String family, String name, float weight, float height, String moving) {
        this.type = type;
        this.family = family;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.moving = moving;
    }



    public void showAnimal(String type) {
        System.out.println("Iveskite gyvuno tipa");

        Animal animal = null;
        switch (type) {
            case "dog":
                animal = new dog();
                animal.showAnimal();
                break;
            case "cat":
                animal = new cat();
                animal.showAnimal();
                break;
            case "pigeon":
                animal = new pigeon();
                animal.showAnimal();
                break;
            case "spider":
                animal = new spider();
                animal.showAnimal();
                break;

        }

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
}
