package Assignment3;

import java.util.Scanner;

public class FindMiddleChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word");
        String word=input.next();
        System.out.print(word.charAt(word.length()/2));
    }
}