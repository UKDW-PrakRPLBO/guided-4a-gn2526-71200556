package com.rplbo.projectrekeninginheritance;

public class RekeningKeluarga extends Rekening{


    public RekeningKeluarga(Nasabah nasabah) {
        
    }

    public RekeningKeluarga(Nasabah nasabah, int saldo) {
        
    }

    public void penyetoran(int jumlah) {
        int total = jumlah - bunga(jumlah);
        super.penyetoran(total);
    }

    private double bunga(int jumlah) {
        return (int)jumlah * 0,5/100;
    }

    @Override
    public void penarikan(int jumlah) {
        int total = jumlah + 5000;
        super.penarikan(total);
    }

}
