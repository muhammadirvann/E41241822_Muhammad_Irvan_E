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
public class Tugas2 {
    
    
    public static void main(String[] args) {
        
        String menu = null;
        String namaPembeli;
        int pilihan;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("            CAFE CERIA");
        System.out.println("           ANEKA MINUMAN");
        System.out.println("=============================================");
        System.out.println("           SPECIAL MENU");
        System.out.println("          1.  Soft Drinks");
        System.out.println("          2.  Mix Juice");
        System.out.println("          3.  Nescafe");
        System.out.println("          4.  Soda Milk");
        System.out.println("          5.  Tea");
        System.out.println("=============================================");
        
        
        System.out.print("Masukkan nama pembeli             : ");
        namaPembeli = scan.nextLine();
        
        System.out.print("Silahkan Masukkan pilihan anda    : ");
        pilihan = scan.nextInt();
        
        switch (pilihan) {
            case 1:
                menu = "Soft Drinks";
                break;
            case 2:
                menu = "Mix Juice";
                break;
            case 3:
                menu = "Nescafe";
                break;
            case 4:
                menu = "Soda Milk";
                break;
            case 5:
                menu = "Tea";
                break;
            default:
                System.out.println("Pesanan anda tidak ada dalam daftar menu");
        }
        
        System.out.println("");
        
        System.out.println("Minuman yang anda pesan adalah " + menu);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih " + namaPembeli + " telah berkunjung di cafe ceria");
      
        
        
    }
    
}
