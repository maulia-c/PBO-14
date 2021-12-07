/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbensin;
import java.util.Scanner;
/**
 *
 * @author Maulia
 */
public class Input {
    public String jenis,perjalanan;
    public double kecepatan;
    
    protected Scanner input = new Scanner(System.in);

    public void inputJenis(){
        System.out.print("Masukan jenis mobil : ");
        this.jenis = input.nextLine();
    }
    public void inputKota(){
        System.out.println("");
        System.out.println("Daftar Perjalanan ");
        System.out.println("a. Solo – Kudus");
        System.out.println("b. Solo – Jakarta");
        System.out.println("c. Solo – Banten ");
        System.out.println("d. Solo – Bandung");
        System.out.println("e. Solo – Banyuwangi");
        System.out.println("f. Solo – Jember");
        System.out.print("Masukan perjalanan (eg = a): ");
        this.perjalanan = input.nextLine();
    }
    public void inputKecepatan(){
        System.out.print("Masukkan kecepatan : ");
        this.kecepatan = input.nextDouble();
    }
}
