/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu_2;

import java.util.Scanner;

/**
 *
 * @author samsu
 */
public class Tugas1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("           Kharisma Agung Plaza ( KAP )");
        System.out.println("             Promo Belanja Berhadiah");
        System.out.println("   Khusus Pembelian 5 Barang Pertama");
        System.out.println("    Dengan harga minimum Rp 10000,00");
        System.out.println("=============================================");
        
        System.out.print("Masukkan nama pembeli : ");
        String namaPembeli = input.nextLine();
        System.out.println("");
        
        int totalHarga = 0;
        int hargaBarang;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            hargaBarang = input.nextInt();
            totalHarga += hargaBarang;
        }
        
        System.out.println("---------------------------------------------");
        System.out.println("Total harga pembelian atas nama " + namaPembeli + " adalah Rp " + totalHarga);
        
        if (totalHarga >= 100000) {
            System.out.println("\nSelamat...");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }
        
        System.out.println("---------------------------------------------");
        System.out.println("                 Terima Kasih");
        System.out.println("  Anda sudah belanja di Kharisma Agung Plaza");

        input.close();
    }
     
    
}
