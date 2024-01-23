package com.example;

import java.util.Scanner;

public class Proje15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Denklemi girin (örnek: 45 - 40 = x): ");
        String equation = scanner.nextLine();

        try {
            double result = solveEquation(equation);
            System.out.println("x = " + result);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double solveEquation(String equation) {
        
        String[] parts = equation.split("=");
        String expression = parts[0].trim();
        double result = Double.parseDouble(parts[1].trim());

        
        String[] terms = expression.split("[+\\-*/]");

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    
                    return result;
                } else {
                    
                    double coefficient = Double.parseDouble(term.replace("x", "").trim());
                    return result / coefficient;
                }
            }
        }

        
        throw new IllegalArgumentException("Denklemde geçerli bir x ifadesi bulunamadı.");
    }
}
