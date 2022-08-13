package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("What's your name: ");
        Scanner name = new Scanner(System.in);
        String store = name.nextLine();
        System.out.println("Your name is " + store);
    }
}