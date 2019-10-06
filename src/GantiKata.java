/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class GantiKata {

    /**
     * @param args
     */
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          
          System.out.println("=====Program Mengganti Kata=====");
          
          System.out.print("Masukkan Kalimat : ");
          String kalimat = scanner.nextLine();
          
          System.out.print("Ganti Kata : ");
          String cari = scanner.next();
          
          System.out.print("Menjadi Kata : ");
          String ganti = scanner.next();
          
          //Hasil 
          
          System.out.println("=====Hasil Formatting=====");
          System.out.println("Kalimat Awal : " + kalimat);
          System.out.println("Kalimat Akhir : " + kalimat.replace(cari, ganti));
      
    }
}
