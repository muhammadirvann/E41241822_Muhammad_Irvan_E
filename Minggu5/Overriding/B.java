/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu_5.Overriding;

/**
 *
 * @author samsu
 */
public class B extends A{
    public void tampilkanKeLayar(){
        super.tampilkanKeLayar();
        System.out.println("Method milik class B dipanggil");
    }
}
