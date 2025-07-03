package com.repaso.recepcionCosmica;

import java.util.ArrayList;

public class cuartoMilenio {
    public static void main(String[] args) {
        ArrayList<String> cosmicos = new ArrayList<>();
        cosmicos.add("Iker");
        cosmicos.add("Carmen");
        cosmicos.add("Rebujito");
        cosmicos.add("Raticulín");
        cosmicos.add("Marte");

        System.out.println(cosmicos);

        cosmicos.remove(1);
        cosmicos.remove(2);

        System.out.println(cosmicos);

        cosmicos.add(1, "MariCarmen");

        System.out.println(cosmicos);

        cosmicos.set((cosmicos.size()-1), "Josefa");

        System.out.println(cosmicos);

        cosmicos.add(2, "Antonio");

        System.out.println(cosmicos);


    }
}
