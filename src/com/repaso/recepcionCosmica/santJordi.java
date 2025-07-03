package com.repaso.recepcionCosmica;

import java.util.ArrayList;
import java.util.Scanner;

public class santJordi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> stJordi = new ArrayList<>();

        System.out.println("Enumera elementos de St. Jordi");
        String jordi = sc.nextLine();

        stJordi.add(jordi);

        System.out.println(stJordi);

    }
}
