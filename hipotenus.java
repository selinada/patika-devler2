package patikadev;

import java.util.Scanner;

public class hipotenus {

	public static void main(String[] args) {
		// Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
		
		double a,b,hipotenüs;
		Scanner input=new Scanner(System.in);
	
		System.out.println("1.kenarı giriniz: ");
		a=input.nextDouble();
		
		System.out.println("2.kenarı giriniz: ");
		b=input.nextDouble();
		
		hipotenüs=Math.sqrt(a*a+b*b);
		
		System.out.println("hipotenüs: "+hipotenüs);
		
		
		

	}

}
