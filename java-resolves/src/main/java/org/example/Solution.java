package org.example;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);


        int N = teclado.nextInt();

        for (int i = 1; i<=10;i++){
            int result;

            result = N * i;

            System.out.println(N +" x "+ i + " = " + result);
        }

    }
}