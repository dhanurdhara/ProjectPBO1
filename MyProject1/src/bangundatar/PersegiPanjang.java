/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author this
 */
public class PersegiPanjang {
    
    public int panjang;
    public int lebar;
    
    public void hitungLuas(){
        int jawab = panjang * lebar;
        System.out.println("Luasnya adalah: " + jawab);
    }
    
    public void hitungKeliling(){
        int jawab = panjang + lebar + panjang + lebar;
        System.out.println("Kelilingnya adalah: " + jawab);
    }
    
}
