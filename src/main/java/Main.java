
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int students = Integer.parseInt(reader.readLine());
        int tables = Integer.parseInt(reader.readLine());
        if (tables * 2 >= students) {
            System.out.println("влезут");
        } else {
            System.out.println("не влезут");
        }
    }
}
