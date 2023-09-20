package patikadev;

import java.util.Scanner;

public class basamaksayılarınıtoplayan {

	public static void main(String[] args) {
		// Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
		
		int girilensayi,basamakdegeri,toplam = 0;
		Scanner input=new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		girilensayi=input.nextInt();
		
		
		while(girilensayi!=0) {
			basamakdegeri=girilensayi%10;
			toplam=toplam+basamakdegeri;
			girilensayi=girilensayi/10;
		}
		System.out.println("toplam: "+toplam);

	}

}
