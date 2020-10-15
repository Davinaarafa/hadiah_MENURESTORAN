/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;

import java.util.Scanner;

/**
 *
 * @author MOKLET-02
 */
public class RESTORAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<<< Selamat Datang, Silahkan Masuk >>>");
        
        System.out.println("1. Menu Makanan");
        System.out.println("2. Menu Minuman");
        
        Scanner input = new Scanner (System.in);
        System.out.print("Silahkan Pilih Menu : ");
        byte pesanan = input.nextByte();
        
        switch (pesanan){
            case 1 :
                System.out.println("\n        Menu Makanan          ");
                String[] menumakanan = {" ","Nasi Ayam Bakar", "Nasi Ayam Goreng","Nasi Bebek Goreng","Nasi Ikan Bakar","Nasi Goreng"};
                int[] hargamakan = {0,22000,17000,19000,35000,10000};
                for (int a =1; a<menumakanan.length; a++)
        System.out.println(a+" "+menumakanan[a]+" => "+hargamakan[a]);
       
        System.out.print("Pilihan Anda :");
        pesanan = (byte) input.nextInt();
        
           int bayar, kembali; 
           System.out.print("Uang yang dibayarkan : ");
           bayar = input.nextInt(); 
             if(bayar == hargamakan[pesanan]){
           System.out.println("Uang anda pas");
            }else if(bayar > hargamakan[pesanan]){
            kembali = bayar - hargamakan[pesanan];
           System.out.println("kembalian anda sebesar : "+kembali);
            }else if(bayar < hargamakan[pesanan]){
           int kurang = hargamakan[pesanan] - bayar;
           System.out.println("Uang anda kurang sebesar "+kurang);}
                break;
            case 2 :
                System.out.print("\nMenu Minuman ");
                System.out.println("\n        Menu Minuman          ");
                String[] menuminuman = {" ","Teh Panas","Jeruk Panas","Es Teh","Es Jeruk","Kopi Susu"};
                int[] hargaminum = {0,3000,3500,2500,3000,2000};
                for (int b =1; b<menuminuman.length; b++)
        System.out.println(b+" "+menuminuman[b]+" => "+hargaminum[b]);
       
        System.out.print("Pilihan Anda :");
        pesanan = (byte) input.nextInt();
        
           System.out.print("Uang yang dibayarkan : ");
           bayar = input.nextInt(); 
             if(bayar == hargaminum[pesanan]){
           System.out.println("Uang anda pas");
            }else if(bayar > hargaminum[pesanan]){
            kembali = bayar - hargaminum[pesanan];
           System.out.println("kembalian anda sebesar : "+kembali);
            }else if(bayar < hargaminum[pesanan]){
           int kurang1 = hargaminum[pesanan] - bayar;
           System.out.println("Uang anda kurang sebesar "+kurang1);}
                break;
            default :
               System.out.print("\nAnda Salah Memasukan Kode");
            break;    
        }
           
      
    }
    
}
