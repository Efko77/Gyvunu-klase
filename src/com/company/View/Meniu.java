package com.company.View;


import com.company.Conttroler.DataFromFile;
import com.company.Model.Animal;

import java.util.Scanner;

public class Meniu {


    public void showMenu() {
        System.out.println("suformuotas gyvunu sarasas");
        System.out.println("0 - baigti darba");
        System.out.println("1 - parodyti gyvuna is saraso");
        System.out.println("2 - pakeisti gyvuno judejima");


    }

    public void dirbam() {

        Scanner sc = new Scanner(System.in);
        boolean arTesti = true;
        do {
            showMenu();
            int meniuTekstas = sc.nextInt();
            switch (meniuTekstas) {
                case 1:
                    System.out.println("Iveskite gyvuno numeri");
                    System.out.println("nuo 0 iki " + (DataFromFile.getInstance().getList().size() - 1));
                    int i = sc.nextInt();
                    System.out.println(DataFromFile.getInstance().getList().get(i));


                    break;
                case 2:
                    System.out.println("Iveskite gyvuno numeri");
                    System.out.println("nuo 0 iki " + (DataFromFile.getInstance().getList().size() - 1));
                    i = sc.nextInt();
                    Animal gyvunas = DataFromFile.getInstance().getList().get(i);
                    System.out.println("Iveskite nauja gyvuno judejima");
                    String judejimas = sc.next();
                    gyvunas.setMoving(judejimas);
                    break;
                case 0:

                    arTesti = false;
                    break;

            }
        } while (arTesti);

    }
}



