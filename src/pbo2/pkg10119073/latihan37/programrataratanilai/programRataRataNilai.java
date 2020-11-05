package pbo2.pkg10119073.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung rata-rata
 * nilai dengan object oriented
 *
 */

public class programRataRataNilai {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scanner = new Scanner (System.in);
        
        int banyakmhs;
        banyakmhs = scanner.nextInt();
        mhs.hitungTotal(mhs.nilaiMhs, banyakmhs);
        mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs, banyakmhs);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "
                + mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs, banyakmhs));
        System.out.println("Developed by : Aghnia Dewi Mahiranie");
    
    }
    
}
