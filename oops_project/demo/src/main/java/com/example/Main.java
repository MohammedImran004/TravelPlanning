package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Travel Agency System!");
        System.out.println("Enter 1 for Admin, 2 for User:");
        int role = sc.nextInt();
        App app = new App(role);
        app.run();
        sc.close();
    }
}
