package patikadev;

import java.util.Scanner;

public class manavkasaprogramı {

	public static void main(String[] args) {
		/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

		Meyveler ve KG Fiyatları

			Armut : 2,14 TL
			Elma : 3,67 TL
			Domates : 1,11 TL
			Muz: 0,95 TL
			Patlıcan : 5,00 TL   */
		
		
		double armut,elma,domates,muz,patlıcan,toplamücret;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("kaç kilo armut ? : ");
		armut=input.nextDouble();
		
		System.out.println("kaç kilo elma ? : ");
		elma=input.nextDouble();
		
		System.out.println("kaç kilo domates ? : ");
		domates=input.nextDouble();
		
		System.out.println("kaç kilo muz ? : ");
		muz=input.nextDouble();
		
		System.out.println("kaç kilo patlıcan ? : ");
		patlıcan=input.nextDouble();
		
		toplamücret=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.00);
		
		System.out.println("toplam ücret: "+toplamücret);
		
		
		
		

	}

}
