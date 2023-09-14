package patikadev;

import java.util.Scanner;

public class dairedilimi {

	public static void main(String[] args) {
	/* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

    𝜋 sayısını = 3.14 alınız.

    Formül : (𝜋 * (r*r) * 𝛼) / 360  */
		
		double pi=3.14;
		int r,merkezaci;
		double alan;
		
		Scanner input=new Scanner(System.in);
		System.out.println("yarıçapını giriniz: ");
		r=input.nextInt();
		
		System.out.println("merkez açının ölçüsünü giriniz: ");
		merkezaci=input.nextInt();
		
		alan=(pi*(r*r)*merkezaci)/360;
		System.out.println("daire dilimin alanı: "+alan);
		
				
		
		
		
		
		

	}

}
