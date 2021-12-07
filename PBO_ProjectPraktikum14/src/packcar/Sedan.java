/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packcar;
import hitungbensin.AntarKota;
import packcar.abstrak;
/**
 *
 * @author Maulia
 */
public class Sedan extends abstrak{

    public Sedan(){
        super.setJenis("Sedan");
        super.setJarakperliter(10);
    }
    

    public void setPerjalanan(String perjalanan){
        this.perjalanan = perjalanan;
    }
    
    @Override
    public double getJarakPerjalanan(){
        AntarKota antar = new AntarKota();
        double jarak = antar.getAntarKota(this.perjalanan);
        return jarak;
    }
}
