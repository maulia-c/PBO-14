/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbensin;

/**
 *
 * @author Maulia
 */
public class hitung {
    private double bensin, waktu;


    public void bensin
        (double jarak, double jarakperliter){
        this.bensin = jarak / jarakperliter;
    }
    public void waktu
        (double jarak, double kecepatan){
        this.waktu = jarak / kecepatan;    
    }
    
    public void outputhitung(){
        System.out.println("Jumlah Minimal Bensin : " + this.bensin + " Liter");
        System.out.println("Lama Waktu Perjalanan : " + this.waktu + " Jam");
    }
}
