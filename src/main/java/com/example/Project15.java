package com.example;

import java.util.Scanner;

public class Project15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Denklemi girin (örneğin: 45 - 40 = x veya 1x0 * 12 = 1200):");
        String equation = scanner.nextLine();

       
        equation = equation.replaceAll("\\s", "");

        
        int indexOfX = equation.indexOf('x');

        if (indexOfX != -1) {
            
            String[] parts = equation.split("=");

            if (parts.length == 2) {
                
                String leftSide = parts[0];
                String rightSide = parts[1];

                double result;

                if (indexOfX < leftSide.length()) {
                    
                    result = evaluateExpression(rightSide) - evaluateExpression(leftSide);
                } else {
                   
                    result = evaluateExpression(leftSide) - evaluateExpression(rightSide);
                }

                System.out.println("x = " + result);
            } else {
                System.out.println("Geçersiz denklem formatı.");
            }
        } else {
            System.out.println("Denkleminizde x bulunamadı.");
        }

        scanner.close();
    }

    
    private static double evaluateExpression(String expression) {
        try {
            return Double.parseDouble(expression);
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz sayı formatı: " + expression);
            System.exit(1);
            return 0;
        }
    }
}
