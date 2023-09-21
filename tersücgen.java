package patikadev;

import java.util.Scanner;

public class tersücgen {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        
	     System.out.print("ters üçgen yüksekliğini girin: ");
		 int satir= input.nextInt();
		 
		 for(int i=satir;i>0;i--) {

			 for(int j=1;j<=satir-i;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=2*i-1;k++) {
				 System.out.print("*");
			 }
			 System.out.println();
			 
		 }

	}

}
