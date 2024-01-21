package com.example;

import java.util.Random;
import java.util.Scanner;

public class Proje11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int kullaniciSkor = 0;
        int bilgisayarSkor = 0;

        for (int tur = 1; tur <= 3; tur++) {
            System.out.println("Tur " + tur + ": Taş (0), Kağıt (1), Makas (2) seçin: ");
            int kullaniciSecim = scanner.nextInt();

            if (kullaniciSecim < 0 || kullaniciSecim > 2) {
                System.out.println("Geçersiz giriş Lütfen 0, 1 veya 2 girin.");
                tur--; 
                continue;
            }

            int bilgisayarSecim = random.nextInt(3);

            System.out.println("Bilgisayarın seçimi: " + bilgisayarSecim);

            if (kullaniciSecim == bilgisayarSecim) {
                System.out.println("Berabere bu turu tekrar oynayın.");
                tur--; 
            } else if ((kullaniciSecim == 0 && bilgisayarSecim == 2) ||
                    (kullaniciSecim == 1 && bilgisayarSecim == 0) ||
                    (kullaniciSecim == 2 && bilgisayarSecim == 1)) {
                System.out.println("Kazandınız!");
                kullaniciSkor++;
            } else {
                System.out.println("Bilgisayar kazandı!");
                bilgisayarSkor++;
            }

            System.out.println("Durum: Kullanıcı " + kullaniciSkor + " - " + bilgisayarSkor + " Bilgisayar\n");
        }

        if (kullaniciSkor > bilgisayarSkor) {
            System.out.println("Tebrikler oyunu kazandınız.");
        } else if (kullaniciSkor < bilgisayarSkor) {
            System.out.println("Üzgünüz bilgisayar oyunu kazandı.");
        } else {
            System.out.println("Oyun berabere bitti.");
        }

        scanner.close();
    }
}

