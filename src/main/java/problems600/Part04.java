package problems600;

import java.util.Scanner;

public class Part04 {

    public static void methodFour() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите двузначное число");
        int numTwoChars = 12;
        System.out.println("введите трехзначное число");
        int numThreeChars = 345;
        int numThreeCHarsSec = 120;
        System.out.println("введите четырехзначное число");
        int numFourChars = 6789;
        int numFourCharsSec = 1234;
        //4.1
        String strTwoChars = Integer.toString(numTwoChars);
        String strThreeChars = Integer.toString(numThreeChars);
        System.out.println(strTwoChars.charAt(0) + " " + strTwoChars.charAt(1));
        //4.2
        System.out.println(strThreeChars.charAt(0) + " "
                + strThreeChars.charAt(1) + " " + strThreeChars.charAt(2));
        //4.3
        System.out.println(strTwoChars.charAt(1) + " " + strTwoChars.charAt(0));
        //4.4
        System.out.println(strThreeChars.charAt(2) + " "
                + strThreeChars.charAt(1) + " " + strThreeChars.charAt(0));
        //4.5
        System.out.println((numTwoChars / 10 * 10) + " + " + strTwoChars.charAt(1));
        //4.6
        System.out.println((numThreeChars / 100 * 100) + " + "
                + (numThreeChars % 100 / 10 * 10) + " + " + strThreeChars.charAt(2));
        //4.7
        String preResult = strTwoChars.charAt(1) + "" + strTwoChars.charAt(0);
        int result = Integer.parseInt(preResult);
        System.out.println(result + 8);
        //4.8
        String preResult2 = strThreeChars.charAt(2) + "" + strThreeChars.charAt(1) + "" + strThreeChars.charAt(0);
        int result2 = Integer.parseInt(preResult2);
        System.out.println(result2 - 20);
        //4.9
        System.out.println("вес двухзначного числа " + numTwoChars % 10 + numTwoChars / 10);
        //4.10
        int one = numThreeChars / 100;
        int two = numThreeChars / 10 % 10;
        int three = numThreeChars % 10;
        System.out.println("вес трехзначного числа " + one + two + three);
        //4.11
        System.out.println("длина двузначного числа " + (numTwoChars % 10 - numTwoChars / 10));
        //4.12
        System.out.println("длина трехзначного числа " + ((numThreeChars / 100)
                - (numThreeChars % 10) * (numThreeChars / 10 % 10)));
        //4.13
        String strNumbTwo = Integer.toString(numTwoChars);
        int count = 0;
        for (int i = 0; i < strNumbTwo.length(); i++) {
            if (strNumbTwo.charAt(i) % 2 == 0)
                count++;
        }
        System.out.println("степень честности двузначного числа: " + count);
        //4.14
        String strNumbThree = Integer.toString(numThreeChars);
        int count2 = 0;
        for (int i = 0; i < strNumbThree.length(); i++) {
            if (strNumbThree.charAt(i) % 2 == 0)
                count2++;
        }
        System.out.println("степень честности трехзначного числа: " + count2);
        //4.15
        String strNumbFour = Integer.toString(numFourChars);
        int count3 = 0;
        for (int i = 0; i < strNumbFour.length(); i++) {
            if (strNumbFour.charAt(i) % 2 == 0)
                count3++;
        }
        System.out.println("степень честности четырехзначного числа: " + count3);
        //4.16
        System.out.println("перестановка трехзначного числа " + (numThreeChars % 10 + ""
                + numThreeChars % 100 / 10 + "" + numThreeChars / 100));//543
        //4.17
        System.out.println("перестановка четырехзначного числа " + (numFourChars % 10 + ""
                + numFourChars % 100 / 10 + "" + (numFourChars % 1000 / 100 % 10) + "" + numFourChars / 1000));//9876
        //4.18
        System.out.println("сдвиг влево трехзначного числа " + numThreeChars % 100 + "" + 0);//450
        //4.19
        System.out.println("сдвиг влево четырехзначного числа " + numFourChars % 1000 + "" + 0);//7890
        //4.20
        System.out.println("сдвиг трехзначного числа влево по кругу " + numThreeChars % 100 + "" + numThreeChars / 100);//453
        //4.21
        System.out.println("сдвиг четырехзначного числа влево по кругу " + numFourChars % 1000 + "" + numFourChars / 1000);//7896
        //4.22
        System.out.println("сдвиг числа вправо по кругу " + numThreeChars % 10 + "" + numThreeChars / 10);//534
        //4.23
        System.out.println("сдвиг числа вправо по кругу " + numFourChars % 10 + "" + numFourChars / 10);//9678
        //4.24
        System.out.println("обмен трехзначных чисел " + numThreeCHarsSec / 100 + "" + numThreeChars % 100
                + " " + numThreeChars / 100 + "" + numThreeCHarsSec % 100);//345 and 120 => 145 and 320
        //4.25
        System.out.println("обмен трехзначных чисел " + numFourCharsSec / 1000 + "" + numFourChars % 1000
                + " " + numFourChars / 1000 + "" + numFourCharsSec % 1000);
        //4.26
        System.out.println("большой обмен над трехзначными числами " + numThreeChars / 10 + "" + numThreeCHarsSec % 10
                + " " + numThreeCHarsSec / 10 + "" + numThreeChars % 10);//345 and 120 => 340 and 125
    }
}
