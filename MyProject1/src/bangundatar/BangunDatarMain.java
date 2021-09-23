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
public class BangunDatarMain {
    public static void main(String[] args) {
        Persegi op1 = new Persegi();
        op1.sisi = 10;
        op1.hitungLuas();
        op1.hitungKeliling();
        
        Persegi op2 = new Persegi();
        op2.sisi = 15;
        op2.hitungLuas();
        op2.hitungKeliling();
        
        Lingkaran op3 = new Lingkaran();
        op3.jari = 25;
        op3.hitungLuas();
        op3.hitungKeliling();
        
        Lingkaran op4 = new Lingkaran();
        op4.jari = 37;
        op4.hitungLuas();
        op4.hitungKeliling();
    }
}
