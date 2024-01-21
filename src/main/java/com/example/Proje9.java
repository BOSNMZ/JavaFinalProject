package com.example;

import java.util.Scanner;

public class Proje9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir decimal sayı girin: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = convertToBinary(decimalNumber);

        System.out.println("Binary karşılığı: " + binaryNumber);
        scanner.close();
    }

    
    private static String convertToBinary(int decimalNumber) {
        StringBuilder binaryBuilder = new StringBuilder();

        if (decimalNumber == 0) {
            binaryBuilder.append(0);
        } else {
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binaryBuilder.insert(0, remainder); 
                decimalNumber = decimalNumber / 2;
            }
        }

        return binaryBuilder.toString();
    }
}
