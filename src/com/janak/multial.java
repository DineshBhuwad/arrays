package com.janak;

import java.util.ArrayList;
import java.util.Scanner;

public class multial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // intil

        for (int i = 0; i < 3 ; i++) {
            list.add(new ArrayList<>());

        }

        // add ele

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
