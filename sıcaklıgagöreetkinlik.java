package patikadev;

import java.util.Scanner;

public class sıcaklıgagöreetkinlik {

	public static void main(String[] args) {
/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/ 
		
		
		int sıcaklık;
		Scanner input=new Scanner(System.in);
		
		System.out.println("hava sıcaklığını giriniz: ");
		sıcaklık=input.nextInt();
		
		if(sıcaklık<5) {
			System.out.println("kayak yapabilirsiniz");
			
		}else if(sıcaklık<=25) {
		
		if(sıcaklık<=15){
			System.out.println("sinemaya gidebilirsiniz");
			
		}
		if(sıcaklık>=15) {
			System.out.println("piknik yapabilirsiniz");
		}
		
		}else {
			System.out.println("yüzme yapabilirsiniz");
		}
		
				
	

	}

}
