/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author this
 */
public class Tabung {
    
    public int jari;
    public int tinggi;
    
    public void hitungVolume(){
        double hasil = 3.14 * jari * jari * tinggi;
        System.out.println("Volume tabung: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 3.14 * 2 * jari * tinggi;
        System.out.println("Luas selimut tabung: " + hasil);
    }
    
}
