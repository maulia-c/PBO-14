/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packcar;

/**
 *
 * @author Maulia
 */
public abstract class abstrak {  

    private String nama, jenis;
    protected String perjalanan;
    private double kecepatan, jarakperliter;


    public abstract double getJarakPerjalanan();
    
  
  
    public void setJenis(String nama){
        this.jenis = jenis;
    }
    public void setKecepatan(double v){
        this.kecepatan = v;
    }
    public void setJarakperliter(double s){
        this.jarakperliter = s;
    }
    

    public String getJenis(){
        return this.jenis;
    }
    public double getKecepatan(){
        return this.kecepatan;
    }
    public double getJarakperliter(){
        return this.jarakperliter;
    }
}
