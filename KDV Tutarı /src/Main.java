import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tutarı Giriniz : ");
		double tutar = scanner.nextDouble();
		
		if(tutar<100) {
		
		double kdv = 1.8 ;
		
		double kdvlı_fıyat = (tutar*kdv*0.1) +tutar ;
		
		System.out.println("KDV siz Fiyat : " +tutar);
		System.out.println("KDV li Fiyat : " +kdvlı_fıyat);
		System.out.println("KDV tutarı : " +kdv);

		
		}
		else if(tutar>=100) {
			double kdv = 0.8 ;
			
			double kdvlı_fıyat = (tutar*kdv*0.1) +tutar ;
			
			System.out.println("KDV siz Fiyat : " +tutar);
			System.out.println("KDV li Fiyat : " +kdvlı_fıyat);
			System.out.println("KDV tutarı : " +kdv);

			
			
			
		}
	}

}
