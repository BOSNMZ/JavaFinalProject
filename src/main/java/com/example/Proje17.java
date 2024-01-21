package com.example;

import java.util.Scanner;

public class Proje17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        int vowelsCount = 0;
        int consonantsCount = 0;
        scanner.close();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelsCount++;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                consonantsCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}