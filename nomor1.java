package tugaspbo;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args){ //prosedur
       Scanner keyboard = new Scanner(System.in);

        //deklarasi variabel
        int bil1,bil2,bil3,hasilTambah,hasilKurang,hasilKali,hasilBagi;

        System.out.println("TUGAS GANJIL NOMOR 1");
        System.out.println("PERHITUNGAN 3 BILANGAN BULAT");
		System.out.println("Masukan 3 bilangan bulat : ");
		
		// input data
		// input data bilangan ke-1
		System.out.print("Bilangan ke-1 : ");
		bil1 = keyboard.nextInt();
		
		// input data bilangan ke-2
		System.out.print("Bilangan ke-2 : ");
		bil2 = keyboard.nextInt();
		
		// input data bilangan ke-3
		System.out.print("Bilangan ke-3 : ");
		bil3 = keyboard.nextInt();
		System.out.println("");
		
		//proses
                hasilTambah = bil1+bil2+bil3;
                hasilKurang = bil1-bil2-bil3;
		hasilKali = bil1*bil2*bil3;
                hasilBagi = bil1/bil2/bil3;
                
		
		//output
                System.out.println(bil1+" + "+bil2+" + "+bil3+" = "+hasilTambah);
                System.out.println(bil1+" - "+bil2+" - "+bil3+" = "+hasilKurang);
		System.out.println(bil1+" x "+bil2+" x "+bil3+" = "+hasilKali);
                System.out.println(bil1+" : "+bil2+" : "+bil3+" = "+hasilBagi);
                
		
    }
}
