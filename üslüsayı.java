package patikadev;

import java.util.Scanner;

public class üslüsayı {

	public static void main(String[] args) {
		
		int deger,üs = 0,sonuc = 1;
		
		Scanner input=new Scanner(System.in);
		System.out.println("üssünü hesaplamak istediğiniz sayıyı giriniz: ");
		deger=input.nextInt();
		
		System.out.println("üssünü giriniz: ");
		üs=input.nextInt();
		
		for(int i=1;i<=üs;i++) {
			sonuc=sonuc*deger;
			
		}
		System.out.println("sonuç: "+ sonuc);

	}

}
