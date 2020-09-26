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
public class PakBejo {
    /*membuat atribut*/
    int panjang, lebar, isi, harga, totalKotakKeramik ;
        
    /*constructor*/
    PakBejo(int p, int l, int i, int h){
        this.panjang = p;
        this.lebar = l;
        this.isi = i;
        this.harga = h;     
    }
    
    // methods
    int jmlhKeramik(){
        int total;
        int luasBangunan = 1000000;
        total = luasBangunan / (panjang * lebar );
        return total;
    }
    int totalKotakKeramik(){
        int total;
        int luasBangunan = 1000000;
        total = (luasBangunan/ (panjang * lebar)) / isi;
        return total;
    }
    int hargaAkhir(){
        int total;
        int luasBangunan = 1000000;
        total = (luasBangunan/ (panjang*lebar)/ isi) * harga;
        return total;
    }
}