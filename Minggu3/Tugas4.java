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
public class Tugas4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Masukkan Jumlah Deret Array   : ");
        int jumlahArray = scan.nextInt();
        
        int[] angka = new int[jumlahArray];
       
        for (int i = 0; i < jumlahArray; i++) {
            angka[i] = (int) (Math.floor(Math.random() * 100));
        }
        
        System.out.println("Array yang di hasilkan : ");
        for (int num : angka) {
            System.out.print(num + " ");
        }
        
        scan.close();
    }
    
}
