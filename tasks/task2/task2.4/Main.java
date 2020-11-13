/*
        Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
        */
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        double deposit = scanner.nextDouble();
        System.out.print("\n"+"Введите сумму процента: ");
        double percent = scanner.nextDouble();
        double income =deposit;
        for (int i = 1; i <6; i++) {
            income =  deposit+income*percent/100;
            System.out.println("За "+i+" год:"+(income));
            deposit=income;

        }
    }
}
