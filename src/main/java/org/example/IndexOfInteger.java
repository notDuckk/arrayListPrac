package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();

        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                System.out.println("Done entering integers into the list");
                break;
            } else {
                list.add(num);
            }
        }
        System.out.println("What number are you looking for in the list?");
        int indexList = input.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == indexList) {
                System.out.println(indexList + " is at index " + i);
            }

        }
    }
}
