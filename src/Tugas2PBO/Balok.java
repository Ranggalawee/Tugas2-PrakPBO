package Tugas2PBO;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    private double tinggi;

    public Balok(double p, double l, double t) {
        super(p, l);
        tinggi = t;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasP() {
        return 2 * (super.hitungLuas() + (super.getLebar() * tinggi) + (super.getPanjang() * tinggi));
    }
}
