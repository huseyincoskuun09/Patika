import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hangi Ay Doğdunuz : ");
		String ay = scanner.nextLine();
		System.out.println("Ayın Kaçında Doğdunuz : ");
		int gun = scanner.nextInt();
		
		if((ay.equals("Mart")&& (gun<31 && gun>20) || (ay.equals("Nisan")&& (gun<21 && gun>0)))) {
			
			System.out.println("Koç Burcusunuz ...");
			
		}

		else if((ay.equals("Nisan")&& (gun<31 && gun>20) || (ay.equals("Mayıs")&& (gun<22 && gun>0)))) {
			
			System.out.println("Boğa Burcusunuz ...");
			
		}
		else if((ay.equals("Mayıs")&& (gun<31 && gun>21) || (ay.equals("Haziran")&& (gun<23 && gun>0)))) {
			
			System.out.println("İkizler Burcusunuz ...");
			
		}

		else if((ay.equals("Haziran")&& (gun<31 && gun>22) || (ay.equals("Temmuz")&& (gun<23 && gun>0)))) {
			
			System.out.println("Yengeç Burcusunuz ...");
			
		}

		else if((ay.equals("Temmuz")&& (gun<31 && gun>22) || (ay.equals("Ağustos")&& (gun<23 && gun>0)))) {
			
			System.out.println("Aslan Burcusunuz ...");
			
		}
		else if((ay.equals("Ağustos")&& (gun<31 && gun>22) || (ay.equals("Eylül")&& (gun<23 && gun>0)))) {
			
			System.out.println("Başak Burcusunuz ...");
			
		}
		else  if((ay.equals("Eylül")&& (gun<31 && gun>22) || (ay.equals("Ekim")&& (gun<23 && gun>0)))) {
	
	System.out.println("Terazi Burcusunuz ...");
	
}
		else  if((ay.equals("Ekim")&& (gun<31 && gun>22) || (ay.equals("Kasım")&& (gun<22 && gun>0)))) {
	
	System.out.println("Akrep Burcusunuz ...");
	
}
		else  if((ay.equals("Kasım")&& (gun<31 && gun>21) || (ay.equals("Aralık")&& (gun<22 && gun>0)))) {
	
	System.out.println("Yay Burcusunuz ...");
	
}
		else   if((ay.equals("Aralık")&& (gun<31 && gun>21) || (ay.equals("Ocak")&& (gun<22 && gun>0)))) {
	
	System.out.println("Oğlak Burcusunuz ...");
	
}
		else    if((ay.equals("Ocak")&& (gun<31 && gun>21) || (ay.equals("Şubat")&& (gun<20 && gun>0)))) {
	
	System.out.println("Kova Burcusunuz ...");
	
}
		else if((ay.equals("Şubat")&& (gun<31 && gun>19) || (ay.equals("Mart")&& (gun<21 && gun>0)))) {
	
	System.out.println("Balık Burcusunuz ...");
	
}
		else {
			System.out.println("Yanlış Giriş Yaptınız...");
			
		}
	}

}
