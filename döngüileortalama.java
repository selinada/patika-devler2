package patikadev;

import java.util.Scanner;

public class döngüileortalama {

	public static void main(String[] args) {
		// Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
		
		
		int girilensayı,ortalama,ortaksayısı = 0,toplam = 0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("bir sayı giriniz: ");
		girilensayı=input.nextInt();
		
		
		for(int i=1;i<=girilensayı;i++) {
			if(i%3==0 && i%4==0) {
				ortaksayısı++;
				toplam+=i;
				System.out.println(i);
			}
			
			}
			ortalama=toplam/ortaksayısı;
			System.out.println("toplam: "+toplam);
			System.out.println("ortalama: "+ortalama);
		}
		

	}


