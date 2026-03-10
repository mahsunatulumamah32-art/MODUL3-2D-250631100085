/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taufiq
 */
public class Mahasiswa {
    // Modifier private
    private String nama;
    private String nim;
    private int nilai;

    // Constructor
    public Mahasiswa(String nama, String nim, int nilai) {
        // keyword this
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Method dengan modifier public
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Nilai: " + nilai);
    }
}

class Main {
    public static void main(String[] args) {
        // Membuat objek menggunakan constructor
        Mahasiswa mhs1 = new Mahasiswa("Mahsunatul", "250631100085", 90);

        // Memanggil method
        mhs1.tampilData();
    }
}
