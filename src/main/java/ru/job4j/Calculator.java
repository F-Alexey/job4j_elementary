package ru.job4j;

import java.util.Scanner;

public class Calculator {
    public static void autoCalc(int a, int b, String str) {
        int result = 0;
            switch(str) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("You cant`t do that");
                        break;
                    }
                    else {
                        result = a / b;
                        break;
                    }
                case "*":
                    result = a * b;
                    break;
            }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число а ");
        int a = in.nextInt();
        System.out.println("опернад");
        String str = in.next();
        System.out.println("Введите число b ");
        int b = in.nextInt();
        autoCalc(a, b, str);
    }
}
