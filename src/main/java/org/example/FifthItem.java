package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();

        while (true) {
            String text = input.nextLine();
            if (text.isEmpty()) {
                break;
            } else {
                list.add(text);
            }
        }

        if (list.size() > 4) {
            System.out.println("The fifth item in the list is" + list.get(4));
        } else {
            System.out.println("There are not 5 items in the list");
        }

    }
}