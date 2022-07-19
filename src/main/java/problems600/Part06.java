package problems600;

import java.util.Scanner;

public class Part06 {
    public static void methodSix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое двузначное число");
        int number = scanner.nextInt();
        System.out.println("введите второе двузначное число");
        int numberTwo = scanner.nextInt();
        System.out.println("введите трехзначное число");
        int numberThreeChars = scanner.nextInt();

        //6.4
        if (number > 0) {
            System.out.println(number * 2);
        }
        //6.5
        if (number == 0) {
            System.out.println("Ноль");
        }
        //6.6
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else System.out.println("Ноль");
        //6.7
        if (number > 99) {
            System.out.println(number - 1);
        }
        //6.8
        if (number > numberTwo) {
            System.out.println(number + numberTwo);
        } else if (number < numberTwo) System.out.println(number * numberTwo);
        else System.out.println("Числа равны");
        //6.9

        //6.10
        if (number > ((number / 10) * (number % 10))) {
            System.out.println("число больше");
        } else System.out.println("произведение цифр больше числа");
        //6.11
        if (number < 0 && numberTwo < 0 || number > 0 && numberTwo > 0) {
            System.out.println("Один и тот же знак");
        } else if (number == 0 || numberTwo == 0)
            System.out.println("Некорректно");
        //6.12
        int c = 2;
        if (numberTwo * numberTwo - 4 * number * c < 0) {
            System.out.println("Да");
        } else System.out.println("Нет");
        //6.13
        if (numberTwo != 0) {
            System.out.println("Дробь существует");
        } else System.out.println("Дробь не существует");
        //6.14
        if (numberTwo * number > 0) {
            System.out.println("Дробь положительна");
        } else  {
            System.out.println("Дробь отрицательна");
        }
    }
}
