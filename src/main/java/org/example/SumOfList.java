package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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
        int i = 1;
        int sum = 0;
        for (Integer integer: list) {

            System.out.print(integer + ", ");
            sum += integer;
            if(i == list.size()){
                System.out.print("and "+ integer);
            }
            i++;

        }
        System.out.println(" were items in the list. The sum of that list is: " + sum);



    }
}
