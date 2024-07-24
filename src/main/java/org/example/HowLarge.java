package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();

        while (true) {
            String text = input.nextLine();
            if (text.isEmpty()) {
                System.out.println("The total amount of item in the list was: " + list.size());
                break;
            } else {
                list.add(text);
            }
        }
    }
}
