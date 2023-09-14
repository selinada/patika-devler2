package patikadev;

import java.util.Scanner;

public class ucakbiletihesaplama {

	public static void main(String[] args) {
/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
 *  Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
 *  Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki 
 *  koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
 Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/ 
		
		
		int mesafe,yas,yolculuktipi,normalücret,yasindirimtutarı,indirimlitutar,sonindirimli,sonindirimtutarı;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Mesafeyi km türünden giriniz: ");
		mesafe=input.nextInt();
		
		System.out.println("yaşınızı giriniz: ");
		yas=input.nextInt();
		
		System.out.println("yolculuk tipini giriniz (1-tek yön ; 2-gidiş/dönüş):  ");
		yolculuktipi=input.nextInt();
		
		normalücret=(int) (mesafe * 0.10);
		
		if(mesafe>0 && yas>0) {
			
			switch(yolculuktipi) {
			case 1:
				if(yas<12) {
					yasindirimtutarı=(int) (normalücret*0.5);
					indirimlitutar=normalücret-yasindirimtutarı;
					System.out.println("tek yön ücret: "+indirimlitutar);
				}else if(yas>=12 || yas<=24) {
					yasindirimtutarı=(int) (normalücret*0.1);
					indirimlitutar=normalücret-yasindirimtutarı;
					System.out.println("tek yön ücret: "+indirimlitutar);
				}else if(yas>24||yas<=65){
					
					System.out.println("tek yön ücret: "+normalücret);
				}else {
					yasindirimtutarı=(int) (normalücret* 0.3);
					indirimlitutar=normalücret-yasindirimtutarı;
					System.out.println("tek yön ücret: "+indirimlitutar);
				}
			case 2:
				if(yas<12) {
					yasindirimtutarı=(int) (normalücret*0.5);
					indirimlitutar=normalücret-yasindirimtutarı;
					sonindirimtutarı=(int) (indirimlitutar*0.2);
					sonindirimli=indirimlitutar-sonindirimtutarı;
					System.out.println("gidiş-dönüş ücret: "+sonindirimli*2);
				}else if(yas>=12 || yas<=24) {
					yasindirimtutarı=(int) (normalücret*0.1);
					indirimlitutar=normalücret-yasindirimtutarı;
					sonindirimtutarı=(int) (indirimlitutar*0.2);
					sonindirimli=indirimlitutar-sonindirimtutarı;
					System.out.println("gidiş-dönüş ücret: "+sonindirimli*2);
				}else if(yas>24||yas<=65){
					
					sonindirimtutarı=(int) (normalücret*0.2);
					sonindirimli=normalücret-sonindirimtutarı;
					System.out.println("gidiş-dönüş ücret: "+sonindirimli*2);
				}else {
					yasindirimtutarı=(int) (normalücret*0.3);
					indirimlitutar=normalücret-yasindirimtutarı;
					sonindirimtutarı=(int) (indirimlitutar*0.2);
					sonindirimli=indirimlitutar-sonindirimtutarı;
					System.out.println("gidiş-dönüş ücret: "+sonindirimli*2);
				}
			}
			
		}else {
			System.out.println("hatalı giriş yaptınız!");
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
