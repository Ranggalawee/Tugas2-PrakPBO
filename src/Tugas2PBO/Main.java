package Tugas2PBO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean ulang = true;

        Scanner input = new Scanner(System.in);

        while(ulang) {
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    double p, l, t;
                    System.out.print("\nInput Panjang: ");
                    p = input.nextDouble();
                    System.out.print("Input Lebar: ");
                    l = input.nextDouble();
                    System.out.print("Input Tinggi: ");
                    t = input.nextInt();
                    Balok balok = new Balok(p, l, t);

                    System.out.println("\nLuas Persegi Panjang = " + balok.hitungLuas());
                    System.out.println("Keliling Persegi Panjang = " + balok.hitungKeliling());
                    System.out.println("Volume Balok = " + balok.hitungVolume());
                    System.out.println("Luas Permukaan Balok = " + balok.hitungLuasP());
                    break;

                case 2:
                    double r;
                    System.out.print("\nInput Tinggi: ");
                    t = input.nextDouble();
                    System.out.print("Input Jari - Jari: ");
                    r = input.nextDouble();
                    Tabung tabung = new Tabung(r, t);

                    System.out.println("\nLuas Lingkaran = " + tabung.hitungLuas());
                    System.out.println("Keliling Lingkaran = " + tabung.hitungKeliling());
                    System.out.println("Volume Tabung = " + tabung.hitungVolume());
                    System.out.println("Luas Permukaan Tabung = " + tabung.hitungLuasP());
                    break;

                case 0:
                    System.out.println("\nProgram telah ditutup.");
                    ulang = false;
                    break;

                default:
                    System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
            System.out.println();
        }
    }
}
