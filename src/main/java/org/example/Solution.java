package org.example;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1 = teclado.next();
            int x = teclado.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);

        }
        System.out.println("================================");
    }
}