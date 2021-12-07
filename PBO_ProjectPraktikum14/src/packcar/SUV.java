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
public class SUV extends abstrak{
 
    public SUV(){
        super.setJenis("SUV");
        super.setJarakperliter(12);
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
