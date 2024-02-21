package tugaspbo;

import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args){
        System.out.println("TUGAS GANJIL NOMOR 3");
	System.out.println("PENJUMLAHAN BILANGAN ASCII DENGAN KARAKTER 1 dan 2");
        
        Scanner keyboard = new Scanner(System.in);
                
        // deklarasi variabel
		int konv1,konv2,hasil;
		char char1,char2, hasilkonv;
	
        // input data bilangan ke-1
		System.out.print("Karakter ke-1 : ");
                char1 = keyboard.next().charAt(0);

        // input data bilangan ke-2
		System.out.print("Karakter ke-2 : ");
                char2 = keyboard.next().charAt(0);
		
		
		//proses
                konv1 = (int) char1;
		konv2 = (int) char2;
		hasil = konv1 + konv2;
                hasilkonv = (char) hasil;
                
		
		//output
		System.out.println("karakter 1"+ konv1);
		System.out.println("karakter 2"+ konv2);
		System.out.println("hasil : "+hasil);
		System.out.println("hasil penjumlahan dikonversi ke karakter : "+hasilkonv);
		
    }
}
