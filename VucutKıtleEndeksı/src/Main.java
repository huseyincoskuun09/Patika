import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen Boyunuzu Giriniz : " );
		double boy = scanner.nextInt();
		System.out.println("Lütfen Kilonuzu Giriniz : ");
		double kılo =scanner.nextInt();
		
		
	double	sonuc = kılo/(boy*boy);
	
	System.out.println("Vücut Kitle Endeksiniz : " +sonuc);
		
		
	}

}
