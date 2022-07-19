package problems600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part07 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //7.5
    public void method7_5() throws IOException {
        int x = Integer.parseInt(reader.readLine());
        if (x > 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Не положительное число");
        }
    }

    //7.6
    public void method7_6() throws IOException {
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        if (x == y) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }

    //7.7
    public void method7_7() throws IOException {
        int students = Integer.parseInt(reader.readLine());
        int chairs = Integer.parseInt(reader.readLine());
        if (chairs >= students) {
            System.out.println("влезут");
        } else {
            System.out.println("не влезут");
        }
    }

    //7.8
    public void method7_8() throws IOException {
        int students = Integer.parseInt(reader.readLine());
        int tables = Integer.parseInt(reader.readLine());
        if (tables * 2 >= students) {
            System.out.println("влезут");
        } else {
            System.out.println("не влезут");
        }
    }

    //7.9
    public void method7_9() throws IOException {
        int cat1 = Integer.parseInt(reader.readLine());
        int cat2 = Integer.parseInt(reader.readLine());
        int gip = Integer.parseInt(reader.readLine());
        if (Math.pow(cat1, 2) + Math.pow(cat2, 2) == Math.pow(gip, 2)) {
            System.out.println("прямоугольный");
        } else {
            System.out.println("не прямоугольный");
        }
    }

    //7.10
    public void method7_10() throws IOException {
        int num = Integer.parseInt(reader.readLine());
        if (num < 0) {
            num *= -1;
        } else {
            num = 0;
        }
    }

    //7.11
    public void method7_11() throws IOException {
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        System.out.println(Math.min(x, y) + " " + Math.max(x, y));
        System.out.println(Math.max(x, y) + " " + Math.min(x, y));
    }
}
