package com.example;

import java.util.Scanner;

public class Proje7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int[] sayilar = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Lütfen " + (i + 1) + ". sayıyı giriniz 0-100 arası: ");
            sayilar[i] = scanner.nextInt();

            
            while (sayilar[i] < 0 || sayilar[i] > 100) {
                System.out.println("Hatalı giriş Sayı 0-100 arasında olmalıdır");
                System.out.print("Lütfen tekrar " + (i + 1) + ". sayıyı giriniz: ");
                sayilar[i] = scanner.nextInt();
            }
        }

        
        int buyukToplam = 0;
        
        int kucukToplam = 0;

        for (int sayi : sayilar) {
            if (sayi >= 50) {
                buyukToplam += sayi;
            } else {
                kucukToplam += sayi;
            }
        }

        
        double oran = (double) buyukToplam / kucukToplam;

        
        System.out.println("50 ve üstü sayıların toplamı: " + buyukToplam);
        System.out.println("50 den küçük sayıların toplamı: " + kucukToplam);
        System.out.println("Oran: " + oran);

        
        scanner.close();
    }

    @Override
    public String toString() {
        return "SayisalOranHesaplama []";
    }
}
