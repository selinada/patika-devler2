package patikadev;

import java.util.Scanner;

public class kullanıcıgirisi2 {

	public static void main(String[] args) {
		/* Eğer şifre yanlış ise kullanıcıya 
		şifresini sıfırlayıp sıfırlamayacağını sorun,
		eğer kullanıcı sıfırlamak isterse yeni girdiği 
		şifrenin hatalı girdiği ve unuttuğu şifre ile aynı 
		olmaması gerektiğini kontrol edip , şifreler aynı ise 
		ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız. */

	
		String username="selin";
		String password="selin123";
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("kullanıcı adınızı giriniz: ");
		String girilenusername=input.nextLine();
		
		System.out.println("şifrenizi giriniz: ");
		String girilenpassword=input.nextLine();
		
		if(girilenusername.equals(username)&& girilenpassword.equals(password)) {
			System.out.println("giriş başarılı");
		}else if(girilenusername.equals(username)) {
			System.out.println("şifreniz hatalı değiştirmek ister misiniz?:  (evet-hayır)");
			String passwordsıfırla=input.nextLine();
			
			if(passwordsıfırla.equalsIgnoreCase("evet")) {
				System.out.println("yeni şifre giriniz: ");
				String newpassword=input.nextLine();
				
				if(newpassword.equals(password) || (newpassword.equals(girilenpassword))) {
					System.out.println("şifre oluşturulamadı,başka şifre giriniz.");
					
				}else {
					System.out.println("şifre oluşturuldu");
				}
			}else {
				System.out.println("şifre oluşturma iptal edildi.");
			}
			
			
		}else {
			System.out.println("kullanıcı adı veya şifre hatalı");
		}
		
		
		
		
	
	}
}
