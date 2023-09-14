package patikadev;

import java.util.Scanner;

public class dortvebeskuvvetleri {

	public static void main(String[] args) {
		// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
		
		int girilensayi;
		Scanner input=new Scanner(System.in);
		System.out.println("bir sayı giriniz: ");
		girilensayi=input.nextInt();
		
		for(int i=1;i<=girilensayi;i*=4) {
			System.out.println(" 4ün kuvvetleri: "+i);
			
		}
		for(int j=1;j<girilensayi;j*=5) {
			System.out.println(" 5in kuvvetleri: "+j);
		}

	}

}
