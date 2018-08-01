package com.company.Conttroler;

import com.company.Model.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataFromFile {
    private ArrayList<Animal> failoDuomenys;


    private static DataFromFile firstInstance = null;

    private DataFromFile() {
        readData();
    }

    public static DataFromFile getInstance() {
        if (firstInstance == null)
            firstInstance = new DataFromFile();
        return firstInstance;
    }

    public ArrayList<Animal> getList() {
        return failoDuomenys;
    }

    private void readData() {
        failoDuomenys = new ArrayList<>();

        FileReader reader = null;

        try {
            reader = new FileReader("AnimalData.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(reader);

        while (sc.hasNext()) {
            String type = sc.next();
            String family = sc.next();
            String name = sc.next();
            float weight = sc.nextFloat();
            float height = sc.nextFloat();
            String moving = sc.next();

            failoDuomenys.add(animalFactory(type, family, name, weight, height, moving));
        }

        sc.close();
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Animal animalFactory(String type, String family, String name, float weight, float height, String moving) {


        Animal animal = null;
        switch (type) {
            case "dog":
                animal = new Dog(type, family, name, weight, height, moving);
                break;
            case "cat":
                animal = new Cat(type, family, name, weight, height, moving);
                break;
            case "pigeon":
                animal = new Pigeon(type, family, name, weight, height, moving);
                break;
            case "spider":
                animal = new Spider(type, family, name, weight, height, moving);
                break;

        }
        return animal;

    }




}
