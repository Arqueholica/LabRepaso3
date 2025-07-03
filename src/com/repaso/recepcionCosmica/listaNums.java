package com.repaso.recepcionCosmica;

import java.util.ArrayList;

public class listaNums {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 20; i < 51 ; i++) {
            nums.add(i);
        }

//        System.out.println(nums);

        for (int num :nums){
            System.out.println("- " + num);
        }
    }
}
