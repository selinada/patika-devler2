package patikadev;

import java.util.Scanner;

public class basithesapmakinesi {

	public static void main(String[] args) {
		
		 int n1,n2,select;
		 Scanner input=new Scanner(System.in);
		 
		 System.out.println("1.sayıyı giriniz: ");
		 n1=input.nextInt();
		 
		 System.out.println("2.sayıyı giriniz: ");
		 n2=input.nextInt();
		 
		 	 System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
		 	 System.out.println("bir seçim yapınız: ");
		 	 select=input.nextInt();
		 	 
		 	 switch(select) {
		 	 case 1:
		 		 System.out.println("sonuç: "+(n1+n2));
		 		 break;
		 	case 2:
		 		 System.out.println("sonuç: "+(n1-n2));
		 		 break;
		 	case 3:
		 		 System.out.println("sonuç: "+(n1*n2));
		 		 break;
		 	case 4:
		 		
		 		 if(n2!=0) {
		 			 System.out.println("sonuç: "+(n1/n2));
		 		 }else {
		 			 System.out.println("hiçbir sayı 0 a bölünemez");
		 		 }
		 		 break;
		 		 default:
		 			 System.out.println("yanlış seçim yaptınız");
		 	 }
		 
		 

	}

}
