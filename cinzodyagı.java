package patikadev;

import java.util.Scanner;

public class cinzodyagı {

	public static void main(String[] args) {
		
		int dogumyılı;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Doğum yılınızı giriniz: ");
		dogumyılı=input.nextInt();
		
		if(dogumyılı>0) {
		
		if(dogumyılı%12==0){
			System.out.println("Çin zodyağı burcunuz: Maymun");
			
		}else if(dogumyılı%12==1) {
			System.out.println("Çin zodyağı burcunuz: Horoz");
			
		}else if(dogumyılı%12==2) {
			System.out.println("Çin zodyağı burcunuz: Köpek");
			
		}else if(dogumyılı%12==3) {
			System.out.println("Çin zodyağı burcunuz: Domuz");
			
		}else if(dogumyılı%12==4) {
			System.out.println("Çin zodyağı burcunuz: Fare");
			
		}else if(dogumyılı%12==5) {
			System.out.println("Çin zodyağı burcunuz: Öküz");
			
		}else if(dogumyılı%12==6) {
			System.out.println("Çin zodyağı burcunuz: Kaplan");
			
		}else if(dogumyılı%12==7) {
			System.out.println("Çin zodyağı burcunuz: Tavşan");
			
		}else if(dogumyılı%12==8) {
			System.out.println("Çin zodyağı burcunuz: Ejderha");
			
		}else if(dogumyılı%12==9) {
			System.out.println("Çin zodyağı burcunuz: Yılan");
			
		}else if(dogumyılı%12==10) {
			System.out.println("Çin zodyağı burcunuz: At");
			
		}else if(dogumyılı%12==11) {
			System.out.println("Çin zodyağı burcunuz: Koyun");
		}	
		
		  }
		else {
			System.out.println("Hatalı giriş yaptınız!");
			}
		
		
	}

}
