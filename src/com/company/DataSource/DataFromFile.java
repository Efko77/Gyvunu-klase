package com.company.DataSource;

import com.company.AnimalData.Animal;
import com.company.Interfaces.InterfaceGetData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class DataFromFile implements InterfaceGetData {
    private HashMap<String, Animal> failoDuomenys;

    @Override
    public Animal getData(String raktas) {
        return failoDuomenys.get(raktas);
    }

    public DataFromFile(String path) {
        failoDuomenys = new HashMap<String, Animal>();
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
            Animal pr = new Animal(type, family, name, weight, height, moving);
            failoDuomenys.put(name, pr);
        }

        sc.close();
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
