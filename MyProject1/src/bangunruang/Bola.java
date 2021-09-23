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
public class Bola {
    
    public int jari;
    
    public void hitungVolume(){
        double hasil = 1.33 * 3.14 * (jari * jari * jari);
        System.out.println("Volume bola: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 4 * 3.14 * jari * jari;
        System.out.println("Luas selimut bola: " + hasil);
    }
    
}
