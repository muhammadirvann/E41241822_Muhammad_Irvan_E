/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu_3;

/**
 *
 * @author samsu
 */
public class Tugas2 {
    
    public static void main(String[] args) {
        
        int angkaAwal = 1;
        int angkaAkhir = 100;
       
        
        
        System.out.println("         Do__While          ");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");
        
        do {            
            System.out.print(" "+ angkaAwal + " ");
            angkaAwal += angkaAwal;
        } while (angkaAwal <= angkaAkhir);
        
    }
    
}
