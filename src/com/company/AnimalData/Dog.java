package com.company.AnimalData;

import com.company.DataSource.DataFromFile;

public class Dog extends Animal{

    public Dog(){
        super(Animal.getData().getData("dog"));

    }

}
