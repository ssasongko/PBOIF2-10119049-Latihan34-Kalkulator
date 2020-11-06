/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan34.kalkulator;
import Kalkulator.Kalkulator;
import java.util.Scanner;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program kalkulator terbaik
 */
public class PBOIF210119049Latihan34Kalkulator {

    public static void main(String[] args) {
        
        Kalkulator calc1 = new Kalkulator(); // object kalkulator
        Scanner scan = new Scanner(System.in); // object scanner
        
        // input two number to calculate
        System.out.println("====Aplikasi Kalkulator Bilangan");
        System.out.print("Masukkan Angka ke-1 : ");
        calc1.value1 = scan.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        calc1.value2 = scan.nextDouble();
        
        System.out.printf("Hasil Pertambahan : %.1f\n",calc1.tambahBilangan());
        System.out.printf("Hasil Pengurangan : %.1f\n",calc1.kurangBilangan());
        System.out.printf("Hasil Perkalian : %.1f\n",calc1.kaliBilangan());
        System.out.printf("Hasil Pembagian : %.1f\n",calc1.bagiBilangan());
        System.out.printf("Hasil Sisa : %.1f\n",calc1.sisaBilangan());
        
        
        
    }
    
}
