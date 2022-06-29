import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		String gercek_sıfre = "1234" ;
		Scanner scanner= new Scanner(System.in) ;
		
		System.out.println("Şifrenizi Giriniz : ");
		String sıfre = scanner.nextLine();
		
		while(true) {
			
			if(!sıfre.equals(gercek_sıfre)) {
				
				System.out.println("Şifreniz Yanlış..");
				System.out.println("Sıfırlamak İstiyor Musunuz ? Evet/Hayır");
				String cevap = scanner.nextLine();
				
				if(cevap.equals("Evet")) {
					
					System.out.println("Yeni Şifrenizi Giriniz : ");
					String yenı_sıfre = scanner.nextLine();
					
					if(yenı_sıfre.equals(sıfre) || yenı_sıfre.equals(gercek_sıfre)) {
						
						System.out.println("Şifre oluşturulamadı Lütfen Başka Şifre Giriniz : ");
				
					}
					else {
						gercek_sıfre = yenı_sıfre ;
						
						System.out.println("Şifre oluşturuldu ....");
						break ;
						
					}
				}
				
			}
		}

	}

}
