package patikadev;

import java.util.Scanner;

public class girilensayıyakadarcıftsayılarıbulma {

	public static void main(String[] args) {
		
		int girilensayı;
		Scanner input=new Scanner(System.in);
		
		System.out.println("bir sayı giriniz: ");
		girilensayı=input.nextInt();
		
		for(int i=1;i<=girilensayı;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}


//Pratik - Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
//Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.