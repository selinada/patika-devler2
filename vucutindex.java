package patikadev;

import java.util.Scanner;

public class vucutindex {

	public static void main(String[] args) {
/*kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül Kilo (kg) / Boy(m) * Boy(m)    */
		
		
		double boy,kilo,index;
		
		Scanner input=new Scanner(System.in);
		 
		System.out.println("lütfen boyunuzu (metre cnsinde) giriniz: ");
		boy=input.nextDouble(); 
		
		System.out.println("lütfen kilonuzu (kg cinsinde) giriniz: ");
		kilo=input.nextDouble();
		
		index=kilo/(boy*boy);
		
		System.out.println("vücut kitle indeksiniz: "+index);
	
		
		

	}

}
