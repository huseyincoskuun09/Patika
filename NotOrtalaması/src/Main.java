import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen Matematik Notunuzu Giriniz : " );
		int math = scanner.nextInt();
		System.out.println("Lütfen Fizik Notunuzu Giriniz : ");
		int fzk =scanner.nextInt();
		System.out.println("Lütfen Türkçe Notunuzu Giriniz : ");
		int trkc = scanner.nextInt();
		System.out.println("Lütfen Kimya Notunuzu Giriniz : ");
		int kmy = scanner.nextInt();
		System.out.println("Lütfen Müzik Notunuzu Giriniz : ");
		int mzk = scanner.nextInt();
		System.out.println("Lütfen Tarih Notunuzu Giriniz : ");
		int trh = scanner.nextInt();
		
		
		int ortalama = (math+fzk+trkc+kmy+mzk+trh)/6 ;
		
		if(ortalama>60) {
			System.out.println("Sınıfı Geçti");
		}
		else {
			System.out.println("Sınıfta Kaldı");
		}
		
		

		
		
	}

}
