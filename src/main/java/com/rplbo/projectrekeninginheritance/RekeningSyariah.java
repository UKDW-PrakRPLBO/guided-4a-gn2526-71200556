package com.rplbo.projectrekeninginheritance;

public class RekeningSyariah extends Rekening{
    
    @Override
    public void penarikan(int jumlah) {
        int total = 0;
        if(jumlah > 100000){
            total = jumlah + 1000;
        } else {
            total = jumlah;
        }
        super.penarikan(total);
    }

    public void sedekah(int jumlah){
        super.penarikan(jumlah);
    }

}
