package com.rplbo.projectrekeninginheritance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RekeningBisnis rb = new RekeningBisnis(new Nasabah("a","laki","super");
        rb.penyetoran(10000);
        rb.penarikan(25000);
        System.out.println(rb.getSaldo());

        RekeningSyariah rs = new RekeningSyariah(new Nasabah("c", "laki","super");
        rs.penyetoran(10000);
        rs.penarikan(25000);
        rs.sedekah(10000);
        System.out.println(rs.getSaldo());
    }
}
