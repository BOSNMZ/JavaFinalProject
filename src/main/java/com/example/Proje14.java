package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Proje14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("İlk tarihi (GG.MM.YYYY) formatında giriniz: ");
        String tarih1Str = scanner.nextLine();

        
        System.out.print("İkinci tarihi (GG.MM.YYYY) formatında giriniz: ");
        String tarih2Str = scanner.nextLine();

        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date tarih1 = dateFormat.parse(tarih1Str);
            Date tarih2 = dateFormat.parse(tarih2Str);

            
            long farkZaman = tarih2.getTime() - tarih1.getTime();
            long farkGun = farkZaman / (1000 * 60 * 60 * 24);
            long farkYil = farkGun / 365;
            long farkAy = (farkGun % 365) / 30;

           
            System.out.println("Tarih farkı: " + farkGun + " gün, " + farkAy + " ay, " + farkYil + " yıl.");
        } catch (ParseException e) {
            System.out.println("Hatalı tarih formatı. Lütfen GG.MM.YYYY formatında giriniz.");
        } finally {
            scanner.close();
        }
    }
}

