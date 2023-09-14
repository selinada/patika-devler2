package patikadev;

import java.util.Scanner;

public class burcbulma {

	public static void main(String[] args) {
/*Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart*/ 
		
		int day;
		String month;
		Scanner input=new Scanner(System.in);
		
		System.out.println("doğduğunuz ayı giriniz: ");
		month=input.nextLine();
		
		System.out.println("doğduğunuz günü giriniz: ");
		day=input.nextInt();
		
		if(month.equalsIgnoreCase("ocak")) {
			if(day>=1 && day<=21) {
				System.out.println("oğlak burcusunuz!");
			}else if(day>=22 && day<=31) {
				System.out.println("kova burcusunuz!");
			}else {
				System.out.println("yanlış değer girdiniz!,değeriniz 1-31 arası olmalıdır!");
			}
			
			
		}else if(month.equalsIgnoreCase("şubat")) {
			if(day>=1 && day<=19) {
				System.out.println("kova burcusunuz!");
			}else if(day>=20 && day<=30) {
				System.out.println("balık burcusunuz!");
		}else {
			System.out.println("yanlış değer girdiniz!,değeriniz 1-30 arası olmalıdır!");
		}
			
			
	   }else if(month.equalsIgnoreCase("mart")) {
		   if(day>=1 && day<=20) {
				System.out.println("balık burcusunuz!");
			}else if(day>=21 && day<=31) {
				System.out.println("koç burcusunuz!");
	       }else {
	    	   System.out.println("yanlış değer girdiniz!,değeriniz 1-31 arası olmalıdır!");
	       }
		   
		   
       }else if(month.equalsIgnoreCase("nisan")) {
    	   if(day>=1 && day<=20) {
				System.out.println("koç burcusunuz!");
			}else if(day>=21 && day<=30) {
				System.out.println("boğa burcusunuz!");
         }else {
        	 System.out.println("yanlış değer girdiniz!,değeriniz 1-30 arası olmalıdır!");
         }
    	   
    	   
       }else if(month.equalsIgnoreCase("mayıs")){
    	   if(day>=1 && day<=21) {
				System.out.println("boğa burcusunuz!");
			}else if(day>=22 && day<=31) {
				System.out.println("ikizler burcusunuz!");
       		}else {
       			System.out.println("yanlış değer girdiniz!,değeriniz 1-31 arası olmalıdır!");
       		}
    	   
    	   
       }else if(month.equalsIgnoreCase("haziran")) {
    	   if(day>=1 && day<=22) {
				System.out.println("ikizler burcusunuz!");
			}else if(day>=23 && day<=30) {
				System.out.println("yengeç burcusunuz!");
       }else {
    	   System.out.println("yanlış değer girdiniz!,değeriniz 1-30 arası olmalıdır!");
       }
    	   
    	   
       }else if(month.equalsIgnoreCase("temmuz")) {
    	   if(day>=1 && day<=22) {
				System.out.println("yengeç burcusunuz!");
			}else if(day>=23 && day<=31) {
				System.out.println("aslan burcusunuz!");
       }else {
    	   System.out.println("yanlış değer girdiniz!,değeriniz 1-31 arası olmalıdır!");
       }
    	   
    	   
       }else if(month.equalsIgnoreCase("ağustos")) {
    	   if(day>=1 && day<=22) {
				System.out.println("aslan burcusunuz!");
			}else if(day>=23 && day<=31) {
				System.out.println("başak burcusunuz!");
       }else {
    	   System.out.println("yanlış değer girdiniz!,değeriniz 1-31 arası olmalıdır!");
       }
    	   
    	   
       }else if(month.equalsIgnoreCase("eylül")) {
    	   if(day>=1 && day<=22) {
				System.out.println("başak burcusunuz!");
			}else if(day>=23 && day<=30) {
				System.out.println("terazi burcusunuz!");
       }else {
    	   System.out.println("yanlış değer girdiniz!,değeriniz 1-30 arası olmalıdır!");
       }
    	   
    	   
       }else if(month.equalsIgnoreCase("ekim")) {
    	   if(day>=1 && day<=22) {
				System.out.println("terazi burcusunuz!");
			}else if(day>=23 && day<=31) {
				System.out.println("akrep burcusunuz!");
       }else {
    	   System.out.println("yanlış değer girdiniz!,değeriniz 1-31 arası olmalıdır!");
       }
    	   
    	   
       }else if(month.equalsIgnoreCase("kasım")) {
    	   if(day>=1 && day<=21) {
				System.out.println("akrep burcusunuz!");
			}else if(day>=22 && day<=30) {
				System.out.println("yay burcusunuz!");
       }else {
    	   System.out.println("yanlış değer girdiniz!,değeriniz 1-30 arası olmalıdır!");
       }
    	   
    	   
       }else if(month.equalsIgnoreCase("aralık")) {
    	   if(day>=1 && day<=21) {
				System.out.println("yay burcusunuz!");
			}else if(day>=22 && day<=31) {
				System.out.println("oğlak burcusunuz!");
       }else {
    	   System.out.println("yanlış değer girdiniz!,değeriniz 1-31 arası olmalıdır!");
       }
		
       }else {
    	   System.out.println("yanlış değer girdiniz,tekrar deneyiniz!");
       }	   
}
	
}
