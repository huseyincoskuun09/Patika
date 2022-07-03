import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mesafeyi km cinsinden giriniz : ");
		
		int km = scanner.nextInt();
		
		
		System.out.println("Yaşınızı Giriniz : ");
		int yas  = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Yolculuk tipini Giriniz(1==>tek yön , 2==>gidiş-dönüş ) : " );
		String yon = scanner.nextLine();
		
		
	
	
		
		
		if(yon.equals("1")) {
			
			if(yas<12) {
				
				double	normal_tutar = km*0.1;
				double yas_ındırımı = normal_tutar*0.5;
				double ındırımlı_tutar = normal_tutar - yas_ındırımı ;
				System.out.println("Toplam tutar : " +ındırımlı_tutar);
				
			}
			else if((yas>12 )&& (yas<24)){
				
				double	normal_tutar = km*0.1;
				double yas_ındırımı = normal_tutar*0.1;
				double ındırımlı_tutar = normal_tutar - yas_ındırımı ;
				System.out.println("Toplam tutar : " +ındırımlı_tutar);
				

			
				
			}
			else if(yas>65) {
				
				double	normal_tutar = km*0.1;
				double yas_ındırımı = normal_tutar*0.3;
			
				double ındırımlı_tutar = normal_tutar - yas_ındırımı ;
				System.out.println("Toplam tutar" +ındırımlı_tutar);
			
			}
		}
		else if(yon.equals("2")) {
			
			
               if(yas<12) {
				
				double	normal_tutar = km*0.1;
				double yas_ındırımı = normal_tutar*0.5;
				double ındırımlı_tutar = normal_tutar - yas_ındırımı ;
				double gıdısdonus_ındırım = ındırımlı_tutar*0.2 ;
				double tutar = (ındırımlı_tutar-gıdısdonus_ındırım)*2 ;
				System.out.println("Toplam tutar : " +tutar);
				
			}
			else if((yas>12 )&& (yas<24)){
				
				double	normal_tutar = km*0.1;
				double yas_ındırımı = normal_tutar*0.1;
				double ındırımlı_tutar = normal_tutar - yas_ındırımı ;
				double gıdısdonus_ındırım = ındırımlı_tutar*0.2 ;
				double tutar = (ındırımlı_tutar-gıdısdonus_ındırım)*2 ;
				System.out.println("Toplam tutar : " +tutar);
				

			
				
			}
			else if(yas>65) {
				
				double	normal_tutar = km*0.1;
				double yas_ındırımı = normal_tutar*0.3;
			    double ındırımlı_tutar = normal_tutar - yas_ındırımı ;
				double gıdısdonus_ındırım = ındırımlı_tutar*0.2 ;
				double tutar = (ındırımlı_tutar-gıdısdonus_ındırım)*2 ;
				System.out.println("Toplam tutar : " +tutar);
			
			}
			
		}
		else {
			System.out.println("Hatalı Veri Girdiniz ! .");
		}
		
		
	}

}
