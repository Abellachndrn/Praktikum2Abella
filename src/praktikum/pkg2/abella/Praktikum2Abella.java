/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg2.abella;

/**
 *
 * @author asus
 */
public class Praktikum2Abella {

    public static void main(String[] args) {
        //Instansiasi
        PakBejo pb1 = new PakBejo(30,30,10,54000);
        System.out.println("Total keramik 1 yaitu " + pb1.totalKotakKeramik() + " pcs");
        System.out.println("Total box keramik 1 yaitu " + pb1.jmlhKeramik() + " box");
        System.out.println("Total harga keramik 1 yaitu Rp " + pb1.hargaAkhir() + " rupiah");
        System.out.println("--------------------------------------------------------------");
        
        
        PakBejo pb2 = new PakBejo(40,40,5,65000);
        System.out.println("Total keramik 2 yaitu " + pb2.totalKotakKeramik() + " pcs");
        System.out.println("Total box keramik 2 yaitu " + pb2.jmlhKeramik() + " box");
        System.out.println("Total harga keramik 2 yaitu Rp " + pb2.hargaAkhir() + " rupiah");
        System.out.println("--------------------------------------------------------------");
        
        PakBejo pb3 = new PakBejo(30,40,8,60000);
        System.out.println("Total keramik 3 yaitu " + pb3.totalKotakKeramik() + " pcs");
        System.out.println("Total box keramik 3 yaitu " + pb3.jmlhKeramik() + " box");
        System.out.println("Total harga keramik 3 yaitu Rp " + pb3.hargaAkhir() + " rupiah");
        System.out.println("--------------------------------------------------------------");
    }     
}
