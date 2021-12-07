/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbensin;
import packcar.MPV;
import packcar.Sedan;
import packcar.SUV;
/**
 *
 * @author Maulia
 */
public class MainClass {

    public static void main(String[] args){
        double  jarak = 0,kecepatan = 0,jarakperliter = 0;
        
        Input di = new Input();
        di.inputJenis();
        di.inputKota();
        di.inputKecepatan();

        switch(di.jenis.toLowerCase()){
            case "sedan":
                Sedan sed = new Sedan();
                sed.setPerjalanan(di.perjalanan.toLowerCase() );
                sed.setKecepatan(di.kecepatan );

                jarak = sed.getJarakPerjalanan();
                jarakperliter = sed.getJarakperliter();
                kecepatan = sed.getKecepatan(); 
                System.out.println();
                break;
                
            case "suv" :
                SUV suv = new SUV();
                suv.setPerjalanan(di.perjalanan.toLowerCase() );
                suv.setKecepatan(di.kecepatan );
                
                jarak = suv.getJarakPerjalanan();
                jarakperliter = suv.getJarakperliter();
                kecepatan = suv.getKecepatan();
                break;
                
            case "mpv" : 
                MPV mpv = new MPV();
                mpv.setPerjalanan(di.perjalanan.toLowerCase() );
                mpv.setKecepatan(di.kecepatan );

                jarak = mpv.getJarakPerjalanan();
                jarakperliter = mpv.getJarakperliter();
                kecepatan = mpv.getKecepatan();
                break;
                
            default: 
                System.out.println("JENIS MOBIL TIDAK ADA");
                System.exit(0);
        }
        
        hitung hi = new hitung();
        hi.bensin(jarak, jarakperliter);
        hi.waktu(jarak, kecepatan);
        
  
        System.out.println("\n");
        System.out.println("---- Hasil ----");
        System.out.println("Jenis Mobil           : " + di.jenis);
        System.out.println("Perjalanan            : " + di.perjalanan);
        hi.outputhitung();
    }
}
