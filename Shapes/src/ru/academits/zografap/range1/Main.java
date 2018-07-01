package ru.academits.zografap.range1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона");
        double from = scanner.nextDouble();

        System.out.println("Введите конец диапазона");
        double to = scanner.nextDouble();

        Range range1 = new Range(from, to);

        System.out.println("Введите число X");
        double x = scanner.nextDouble();

        System.out.println("Длинна диапазона = " + range1.getIntervalLength());

        if (range1.isInside(x)) {
            System.out.println("Число принадлежит диапазону");
        } else {
            System.out.println("Число не принадлежит диапазону");
        }
    }
}
