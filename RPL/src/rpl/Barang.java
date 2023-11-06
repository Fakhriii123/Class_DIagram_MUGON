/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpl;

/**
 *
 * @author Daud Oscar
 */
public class Barang {
    public String namaBarang, TipeBarang;
    private String Lokasi;
    public int Harga;
    public double Kondisi;
    public boolean isBaru;
    
    public Barang(String namaBarang, String TipeBarang, String Lokasi, int Harga, double Kondisi, boolean isBaru) {
        this.namaBarang = namaBarang;
        this.TipeBarang = TipeBarang;
        this.Lokasi = Lokasi;
        this.Harga = Harga;
        this.Kondisi = Kondisi;
        this.isBaru = isBaru;
    }
    
    public String getLokasi(){
        return this.Lokasi;
    }

    Barang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
