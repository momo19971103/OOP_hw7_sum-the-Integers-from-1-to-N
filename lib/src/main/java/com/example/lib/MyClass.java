package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int countN,total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請問要加到");
        countN = scanner.nextInt();
        for(;countN>0;countN--){
            total+=countN;
        }
        System.out.println("總共"+total);
    }
}
