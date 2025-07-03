package com.repaso.recepcionCosmica;

import java.util.ArrayList;
import java.util.Scanner;

public class santJordi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> stJordi = new ArrayList<>();
        String jordi;

        do{
            System.out.println("Enumera elementos de St. Jordi. Escribe 'salir' para ver todos los elementos.");
            jordi = sc.nextLine();

            stJordi.add(jordi);

        }while(!jordi.equalsIgnoreCase("salir"));



        System.out.println(stJordi);

    }
}
