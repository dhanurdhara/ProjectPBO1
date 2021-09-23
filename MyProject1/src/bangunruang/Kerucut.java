/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

import java.lang.Math;

/**
 *
 * @author this
 */
public class Kerucut {
    
    public int jari;
    public int tinggi;
    
    public void hitungVolume(){
        double hasil = 0.33 * 3.14 * jari * jari * tinggi;
        System.out.println("Volume kerucut: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 3.14 * jari * (Math.sqrt((jari * jari) + (tinggi * tinggi)));
        System.out.println("Luas selimu kerucut: " + hasil);
    }
    
}
