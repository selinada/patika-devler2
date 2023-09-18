package patikadev;

import java.util.Scanner;

public class kombinasyon {

	public static void main(String[] args) {
/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı 
 * grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li
 *  kombinasyonu C(n,r) şeklinde gösterilir.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)*/ 
		
		
		int combination=1,n,r,nfak = 1,rfak=1,nrfak=1;
		Scanner input=new Scanner(System.in);
		System.out.println("n sayısını giriniz: ");
		n=input.nextInt();
		
		System.out.println("r sayısını giriniz: ");
		r=input.nextInt();
		
		if(n<0 || r<0 || n<r){
			System.out.println("geçersiz bir sayı girdiniz! ");
			
		}else {
		
		for(int i=1;i<n;i++) {
			nfak=nfak*i;
		}
		for(int i=1;i<r;i++) {
			rfak=rfak*i;
		}
		for(int i=1;i<(n-r);i++) {
			nrfak=nrfak*i;
		}
		combination=nfak/(rfak * nrfak);
		
		System.out.println("kombinasyon= "+combination);
		
		
		}
	}
}

