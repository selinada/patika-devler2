package patikadev;

import java.util.Scanner;

public class çiftartıdördünkatı {

	public static void main(String[] args) {
		// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve 
//		girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
		
		int toplam=0,girilensayi;
		Scanner input=new Scanner(System.in);
		
		do {
			System.out.println("sayı giriniz: ");
			girilensayi=input.nextInt();
			
			if(girilensayi%2==0 || girilensayi%4==0) {
				toplam+=girilensayi;
			}
		}while(girilensayi%2==0);
		System.out.println("çift sayılar ve 4ün katı sayıların toplamı: "+toplam);

	}

}
