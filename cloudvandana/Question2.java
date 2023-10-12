package cloudvandana;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman number(Examples : VII,IX,LXVI,CX,CDLVI,MI");
        String input = sc.next();
        System.out.println(romanToInt(input));
        sc.close();
    }

    public static int romanToInt(String s) {
        int output = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < output) {
                output -= num;
            } else {
                output += num;
            }
        }
        return output;
    }
}
