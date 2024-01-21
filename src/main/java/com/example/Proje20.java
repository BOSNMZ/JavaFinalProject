package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Proje20 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Doğum tarihini giriniz (dd.MM.yyyy): ");
            String dogumTarihiStr = scanner.nextLine();

            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                Date dogumTarihi = dateFormat.parse(dogumTarihiStr);

                String gunAdi = gunBul(dogumTarihi);
                System.out.println("Doğduğunuz gün: " + gunAdi);

            } catch (ParseException e) {
                System.out.println("Geçersiz tarih formatı lütfen dd.MM.yyyy formatında girin.");
            }
        }
    }

    private static String gunBul(Date tarih) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        return dateFormat.format(tarih);
    }
}
