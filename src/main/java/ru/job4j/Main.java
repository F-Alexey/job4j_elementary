package ru.job4j;

public class Main {
    public static void main(String[] args) {
        System.out.println("привет, сейчас мы запустим калькулятор из  main файла с вводом данных");
        Calculator.main();
        System.out.println("А сейчас запустим его же но с вводом изнутри");
        Calculator.autoCalc(1,3,"+");
    }
}