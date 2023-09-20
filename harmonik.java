package patikadev;

import java.util.Scanner;

public class harmonik {

	public static void main(String[] args) {
		
		int sayi;
		double toplam=0.0;
		Scanner input=new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		sayi=input.nextInt();
		
		for(double i=1;i<=sayi;i++) {
			toplam=toplam+(1/i);
		}
		System.out.println("toplam: "+toplam);
		
		
		

	}

}
