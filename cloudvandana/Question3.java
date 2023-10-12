package cloudvandana;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a pangram:");
        String input = scanner.nextLine();
        scanner.close();
        
        if(input.length()<26){
        	System.out.println(input+" is not a pangram.");
        }
        else{
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println(input +" is a pangram.");
        } else {
            System.out.println(input+" is not a pangram.");
        }
        }
    }

    public static boolean isPangram(String str) {
    
        boolean[] alphabet = new boolean[26];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
