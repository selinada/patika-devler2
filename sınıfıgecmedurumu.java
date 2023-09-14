package patikadev;

import java.util.Scanner;

public class sınıfıgecmedurumu {

	public static void main(String[] args) {
		
		int turkce,mat,fizik,kimya,muzik;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("türkçe notunuzu giriniz: ");
		turkce=input.nextInt();
		
		System.out.println("matematik notunuzu giriniz: ");
		mat=input.nextInt();
		
		System.out.println("fizik notunuzu giriniz: ");
		fizik=input.nextInt();
		
		System.out.println("kimya notunuzu giriniz: ");
		kimya=input.nextInt();
		
		System.out.println("müzik notunuzu giriniz: ");
		muzik=input.nextInt();
		
		double ortalama=(turkce+mat+fizik+kimya+muzik)/5;
		
		
		if(turkce<0 || turkce>100 || mat<0 || mat>100 || fizik<0 || fizik>100 || kimya<0 || kimya>100 || muzik<0 || muzik>100) {
			System.out.println("yanlış değer girdiniz, lütfen 0-100 arası seçim yapınız!");
		}
		
		else if(ortalama>=55) {
			System.out.println("sınıfı geçtiniz!");
			
		}else {
			System.out.println("sınıfta kaldınız!");
			//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
			
		}
		

	}

}
