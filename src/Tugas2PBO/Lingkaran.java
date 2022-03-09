package Tugas2PBO;

public class Lingkaran implements MenghitungBidang {
    private double jari;

    public Lingkaran(double r) {
        jari = r;
    }

    public void setJari(int r) {
        jari = r;
    }

    public double getJari() {
        return jari;
    }

    public double getDiameter() {
        return 2 * jari;
    }

    @Override
    public double hitungLuas() {
        return PHI * (jari * jari);
    }

    @Override
    public double hitungKeliling() {
        return PHI * (2 * jari);
    }
}
