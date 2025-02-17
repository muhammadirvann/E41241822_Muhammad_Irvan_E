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
public class For {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Masukkan Jumlah Baris : ");
        int baris = scan.nextInt();
        
        System.out.print("Masukkan Jumlah Kolom : ");
        int kolom = scan.nextInt();
        
        scan.close();
        
        for (int i = 0; i <= baris; i++) {
            for (int j = 0; j <= kolom; j++) {
                if (j <= i) {
                System.out.print("*");
                }
            }
            System.out.println("");
        }
        
    }
}
