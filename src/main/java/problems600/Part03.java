package problems600;

import java.util.Scanner;

public class Part03 {

    public static void methodThree() {
        Scanner scanner = new Scanner(System.in);
        double doubleNumb = scanner.nextDouble();
        double doubleNumbTwo = scanner.nextDouble();
        double doubleNumbThree = scanner.nextDouble();
        //3.1
        System.out.println("По цельсию " + (5 * (doubleNumb - 32) / 9));
        //3.2
        System.out.println("Длина в дюймах равна: " + doubleNumb / 2.54);
        //3.3
        System.out.println("Длина в сантиметрах равна: " + doubleNumb * 2.54);
        //3.4
        System.out.println("Сумма в рублях: " + doubleNumb * doubleNumbTwo);
        //3.5
        System.out.println("площадь прямоугольного треугольника равна " + ((doubleNumb * doubleNumbTwo) / 2));
        System.out.println("периметр прямоугольного треугольника равен " + (doubleNumb + doubleNumbTwo + doubleNumbThree));
        //3.6
        System.out.println(doubleNumb + 2 + " " + (doubleNumb + 2 + 2) + " " + (doubleNumb + 2 + 2 + 2));
        //3.7
        System.out.println(doubleNumb - 2 + "\n" + (doubleNumb - 2 - 2) + "\n" + (doubleNumb - 2 - 2 - 2));
        //3.8
        System.out.println("площадь равнобедренного треугольника равна " + (doubleNumb * doubleNumbTwo * 0.5));
        System.out.println("периметр равнобедренного треугольника равна " + (doubleNumb + doubleNumbTwo * 2));
        //3.9
        System.out.println("Сумма баллов: " + (doubleNumb * 10 + doubleNumbTwo * 100 + doubleNumbThree * 1000));
        //3.10
        System.out.println("Денег в евро у Васи " + (doubleNumb + doubleNumbTwo) / doubleNumbThree);
    }
}