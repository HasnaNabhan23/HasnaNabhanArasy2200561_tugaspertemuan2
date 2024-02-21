package tugaspbo;

import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
		
		//deklarasi variabel
		int uang;
		String cuaca;
		boolean hujan = true;
		
		//input data
		System.out.print("cuaca hari ini [hujan/tidak] : ");
		cuaca  = keyboard.nextLine(); //nextLine untuk string
		System.out.print("Uang : ");
		uang  = keyboard.nextInt();
		
		//proses
		if(cuaca.equals("hujan")){ //equals perbandingan
			hujan = true;
		}else{
			hujan = false;
		}
		
		//output
		if((uang > 5000)&&(!hujan)){
			System.out.println("Aku akan membeli gorengan");
		}else{
			System.out.println("Aku tidak akan membeli gorengan");
		}
		
    }
    
}
