package patikadev;

import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {
// Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

/*  Taksimetre KM başına 2.20 TL tutmaktadır.
	Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
	Taksimetre açılış ücreti 10 TL'dir.   			 */

		double km,toplam;
		double acilis=10;
		Scanner input=new Scanner(System.in);
		
		System.out.println("gidilen mesafeyi km cinsinden giriniz: ");
		km=input.nextDouble();
		
		toplam=(km*2.20)+acilis;
		
	    toplam=(toplam<20) ? 20:toplam;
	    System.out.println("toplam ücret: "+toplam);
	    
		
		
		
		
	}

}
