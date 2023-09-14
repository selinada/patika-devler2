package patikadev;

import java.util.Scanner;

public class notortalaması {
//Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.


	public static void main(String[] args) {
		
		int mat,fizik,kimya,turkce,tarih,muzik,ortalama;
		Scanner input=new Scanner(System.in);
		
		System.out.println("matematik notunuzu giriniz: ");
		mat=input.nextInt();
		
		System.out.println("fizik notunuzu giriniz: ");
		fizik=input.nextInt();
		
		System.out.println("kimya notunuzu giriniz: ");
		kimya=input.nextInt();
		
		System.out.println("turkce notunuzu giriniz: ");
		turkce=input.nextInt();
		
		System.out.println("tarih notunuzu giriniz: ");
		tarih=input.nextInt();
		
		System.out.println("muzik notunuzu giriniz: ");
		muzik=input.nextInt();
		
		ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6;
		System.out.println("ortalama: "+ ortalama);
		
		boolean gecmenotu=(ortalama>=60);
		String sonuc=gecmenotu? "sınıfı geçti":"sınıfta kaldı";
		
		System.out.println(sonuc);
		
		
		
		
	
		
		


	}

}
