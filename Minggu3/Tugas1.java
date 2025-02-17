/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu_3;

import java.util.Scanner;

/**
 *
 * @author samsu
 */
public class Tugas1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Masukkan Angka Awal    : ");
        int angkaAwal = scan.nextInt();
        
        System.out.print("Masukkan Angka Akhir   : ");
        int angkaAkhir = scan.nextInt();
        
        for (int i = angkaAwal; i < angkaAkhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
    }
    
}
