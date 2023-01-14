package org.example;
import java.util.*;
class AsalBul{
    void SayiBul(int sayi)
    {
        int sayac=0;
        int donguSayisi=0;
        for(int i=1; i<sayi; i++)
        {
            if(sayi%i==0)
            {
                donguSayisi++;
                //Eğer donguSayısı 2 veya daha fazla çıkarsa ise sayı asal olmamış oluyor.
                //System.out.println(i);
            }
        }
        if(donguSayisi>=2) {
          //  System.out.println("Bulduğumuz " + sayi + " sayısı bir asal sayı değildir..");
        }
        else
        {
            System.out.println("Bulduğumuz  "+sayi+" sayısı bir asal sayıdır.");
            sayac++;
        }
        if(sayac>0)
        {
            System.exit(0);
        }

    }
       void MatrixOlustur() {
       Random r = new Random();
       AsalBul a=new AsalBul();
       int sayi ;
       sayi= r.nextInt(10);
       int dizi[][] = new int[sayi][sayi];
       for (int i = 0; i < dizi.length; i++) {
           for (int j = 0; j < dizi.length; j++) {
               dizi[i][j] = r.nextInt(100);
               System.out.print(dizi[i][j] + "\t");
           }
           System.out.println();

       }
       for (int i = 0; i < dizi.length; i++) {
               for (int j = 0; j < dizi.length; j++) {
                   a.SayiBul(dizi[i][j]);
               }
               System.out.println();

           }

       }
}

public class Main {
    public static void main(String[] args) {
        AsalBul a=new AsalBul();
        a.MatrixOlustur();
    }
}