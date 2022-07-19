package problems600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part08 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //8.5
    public void method8_5() throws IOException {
        int x = Integer.parseInt(reader.readLine());
        int a = Integer.parseInt(reader.readLine());
        //1.
        if (x > 0) {
            System.out.println("plus");
        } else {
            System.out.println("not plus");
        }
        //2.
        if (x > a) {
            a = -1;
        } else {
            a = 0;
        }
        //3.
        if (a > 100) {
            System.out.println("Верное число");
        } else {
            System.out.println("Ошибка");
        }
        //4.
        if (a != x) {
            a = x;
        } else {
            x = a * 2;
        }
        // 5.
        if (x > 0) {
            x += 1;
        } else {
            x -= 1;
        }
    }
}
