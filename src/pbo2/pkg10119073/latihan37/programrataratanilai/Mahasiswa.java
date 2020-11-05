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

public class Mahasiswa {
    public int nilaiMhs;
    public double totalNilaiMhs;
    Scanner scanner = new Scanner(System.in);

    public double hitungTotal(int nilaiMhs, int banyakMhs) {
        for (int i = 1; i <= banyakMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilaiMhs = scanner.nextInt();
            totalNilaiMhs += nilaiMhs;
        }
        return totalNilaiMhs;
    }

    public double hitungRataRataNilaiMhs(double total, int banyakMhs) {
        return total / banyakMhs;
    }
}
