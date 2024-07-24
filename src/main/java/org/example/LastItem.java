package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class LastItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();

        while (true) {
            String text = input.nextLine();
            if (text.isEmpty()) {
                String lastItem = list.get(list.size() - 1);
                System.out.println("The last item in the list is: " + lastItem);
                break;
            } else {
                list.add(text);
            }
        }
    }
}
