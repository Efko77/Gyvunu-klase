package com.company;

import com.company.Conttroler.DataFromFile;
import com.company.View.Meniu;

public class Main {

    public static void main(String[] args) {

        DataFromFile.getInstance();
        Meniu menu = new Meniu();
        menu.dirbam();
    }


    //Meniu object=new Meniu();
    //object.showMeniu();
}
