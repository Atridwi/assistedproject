package com.assistedproject;

import java.util.*;

public class Program11 {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("Enter number of elements to be sorted: ");

       String num_of_elements = input.nextLine();

       String[] num = new String[];

       for (int i = 0; i < num_of_elements; i++)
       {
           System.out.print("Element" + (i + 1) + ": ");

           num[i] = input.nextInt();
        }
        System.out.println();
    }
}
