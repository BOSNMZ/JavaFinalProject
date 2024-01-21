package com.example;

public class Proje10 {

    public static void main(String[] args) {
        int sayiAdedi = 20;
        int sayi = 2;
        int sayiSayaci = 0;

        System.out.println(sayiAdedi + " adet asal sayı:");

        while (sayiSayaci < sayiAdedi) {
            if (asalMi(sayi)) {
                System.out.print(sayi + " ");
                sayiSayaci++;
            }
            sayi++;
        }
    }

    
    public static boolean asalMi(int sayi) {
        if (sayi < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
