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
public class BangunRuangMain {
    public static void main(String[] args){
        Bola op1 = new Bola();
        op1.jari = 7;
        op1.hitungVolume();
        op1.hitungLuasSelimut();
        
        Tabung op2 = new Tabung();
        op2.jari = 7;
        op2.tinggi = 10;
        op2.hitungVolume();
        op2.hitungLuasSelimut();
        
        Kerucut op3 = new Kerucut();
        op3.jari = 7;
        op3.tinggi = 24;
        op3.hitungVolume();
        op3.hitungLuasSelimut();
    }
}
