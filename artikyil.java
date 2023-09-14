package patikadev;

import java.util.Scanner;

public class artikyil {

	public static void main(String[] args) {
		
		int yıl;
		
		Scanner input=new Scanner(System.in);
		System.out.println("yıl giriniz: ");
		yıl=input.nextInt();
		
		if(yıl>0) {
		
		if(yıl%4==0) {
			System.out.println(yıl+" artık yıldır!");
			
		}else if(yıl%100==0 && yıl%400==0) {
			System.out.println(yıl+" artık yıldır!");
			
		}else {
			System.out.println(yıl+" artık yıl değildir!");
		}
		
		}
		else {
			System.out.println("hatalı giriş yaptınız!");
		}

	}

}
