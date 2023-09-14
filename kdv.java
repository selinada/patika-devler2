package patikadev;

import java.util.Scanner;

public class kdv {

	public static void main(String[] args) {

		
		double paradegeri,kdvli,kdvtutari,kdvorani;
		Scanner input=new Scanner(System.in);
		System.out.println("para değeri giriniz: ");
		paradegeri=input.nextDouble();
		
		if(paradegeri>1000) {
			kdvorani=0.08;
		}else {
			kdvorani=0.18;
		}

		kdvli=paradegeri+(paradegeri*kdvorani);
		kdvtutari=paradegeri*kdvorani;
		
		System.out.println("kdvli fiyat: "+kdvli);
		System.out.println("kdv tutarı: "+kdvtutari);
		
		
			
		
		

	}

}
