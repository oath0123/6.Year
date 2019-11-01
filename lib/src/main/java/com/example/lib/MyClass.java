package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("YEAR:");
        int num1 = scanner.nextInt();
        if(num1%4==0&&num1/100!=0)
            System.out.println("LEAP YEAR ");

        else
            System.out.println(" NOY LEAP YEAR " );
    }
}
