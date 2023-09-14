package patikadev;

import java.util.Scanner;

public class ücgeninalanı {

	public static void main(String[] args) {
		// Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
	/*	Formül
		Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

		𝑢 = (a+b+c) / 2

		Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)          */
		
		double a,b,c,alan,u;
		Scanner input=new Scanner(System.in);
		
		System.out.println("1.kenar uzunluğunu giriniz: ");
		a=input.nextDouble();
		
		System.out.println("2.kenar uzunluğunu giriniz: ");
		b=input.nextDouble();
		
		System.out.println("3.kenar uzunluğunu giriniz: ");
		c=input.nextDouble();
		
		u=(a+b+c)/2;
		alan=Math.sqrt(u *(u-a)*(u-b)*(u-c));
		System.out.println("alan: "+alan);
		
		
		
		
		

	}

}
