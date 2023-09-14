package patikadev;

import java.util.Scanner;

public class ikininkuvvetleri {

	public static void main(String[] args) {
		// Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
		
		int girilensayi;
		Scanner input=new Scanner(System.in);
		System.out.println("bir sayı giriniz: ");
		girilensayi=input.nextInt();
		
		for(int i=1;i<=girilensayi;i*=2) {
			System.out.println(i);
		}
		
		

	}

}
