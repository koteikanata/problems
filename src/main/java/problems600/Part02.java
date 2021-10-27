package problems600;

import java.util.Scanner;

public class Part02 {
    static Scanner reader = new Scanner(System.in);

    public static void methodTwo() {
        //2.1
        System.out.println("hello, world!");
        //2.2
        System.out.println("h-e-l-l-o,-f-r-i-e-n-d!");
        //2.3
        System.out.println("+++\n!!!!\n??");
        //2.4
        System.out.println("+++ !!!! ??");
        //2.5
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        System.out.println("a * a = " + (a * a));
        System.out.println("a * 10 = " + (a * 10));
        //2.8
        int x = 6;
        System.out.println(x);
        System.out.println(x * x);
        System.out.println(x * x * x);
        //2.9
        x = 9;
        System.out.println("Значение x равно " + x);
        System.out.println("Квадрат значения x равен " + x * x);
        //2.10
        x = 9;
        int y = 10;
        System.out.println("Значение x равно " + x + "" + y);
        System.out.println("Произведение значений x и y равно " + x * y);
        System.out.println("Сумма значений x и y равна " + x + y);
        //2.11
        System.out.println("Егор Иринин");
        System.out.println("7-800-555-35-35");
        //2.12
        System.out.println("zzzzz");
        System.out.println(" zzz ");
        System.out.println("  z ");
        System.out.println(" zzz ");
        System.out.println("zzzzz");
        //2.14
        System.out.println(a + 10);
        //2.15
        System.out.println(a * 10);
        //2.16
        System.out.println(a + 6);
        System.out.println(a - 12);
        //2.17
        System.out.println(a * a);
        //2.18
        System.out.println((a * a) + "&" + (a * a * a));
        //2.19
        System.out.println(a - 1 + " " + a + " " + (a + 1));
        //2.20
        System.out.println(a + "\n" + (a * -1));
        //2.21
        System.out.println((a + 1) + "\n" + (a + 2) + "\n" + (a + 3));
        //2.22
        System.out.println((a + b) + "\n" + (a * b) + "\n" + (a - b) + "\n" + (b - a));
        //2.23
        System.out.println((a * a) + "\n" + (b * b) + "\n" + (a * a + b * b));
        //2.24
        System.out.println("Площадь прямоугольника равна: " + (a * b));
        System.out.println("Периметр прямооугольника равен: " + ((a + b) * 2));
        //2.25
        System.out.println("Объем параллелепипеда равен: " + (a * b * c));
        System.out.println("Площадь одной грани равен: " + (a * b));
        System.out.println("Площадь второй грани равен: " + (a * c));
        System.out.println("Площадь третьей грани равен: " + (b * c));
        System.out.println("Площадь всего равна: " + (2 * ((b * c) + (a * b) + (a * c))));
        System.out.println("Периметр всего параллелепипеда равен: " + ((a + b + c) * 3));
        //2.26
        System.out.println(a - b);
        //2.27
        System.out.println("Вес равен: " + a);
        //2.28
        double distance = reader.nextDouble();
        System.out.println("Расстояние в метрах: " + (distance * 185.2));
        System.out.println("Расстояние в километрах: " + (distance * 185.2 / 1000));
        //2.29
        System.out.println("Время в секундах: " + (a * 60 * 60));
        //2.30
        System.out.println("секунд прошло с полуночи до данного момента: "
                + (a * 3600 * b * 60));
        System.out.println("минут прошло с полуночи до данного момента: "
                + (a * 60 * b));
        System.out.println("минут осталось до полуночи: " + (24 * 60 - (a * 60 * b)));
        //2.31
        System.out.println("значение кинетической энергии тела: " + ((a * b * b)) / 2);
        //2.32
        System.out.println(a * -1);
        //2.33
        double one = reader.nextDouble();
        double two = reader.nextDouble();
        double height = reader.nextDouble();
        System.out.println("Площадь трапеции равна: " + (0.5 * (one + two) * height));
        //2.34
        String name = "Egor";
        String surname = "Wqeq";
        String patronymic = "Bndv";
        String city = "Cova";
        System.out.println("Привет, " + name);
        //2.35
        System.out.println("Вас зовут " + name + " " + surname);
        //2.36
        System.out.println("Пассажир " + name + " " + surname + " вылетает в " + city);
        //2.37
        System.out.println(name +" " + surname);
        System.out.println(surname +" " + name);
        //2.38
        String surnameI = String.valueOf(surname.charAt(0));
        String nameI = String.valueOf(name.charAt(0));
        String patronymicI = String.valueOf(patronymic.charAt(0));
        System.out.println(surnameI + nameI + patronymicI);
        //
    }
}
