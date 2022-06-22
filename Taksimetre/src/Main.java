import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Taksimetre Açılış Ücreti 10 TL dir.");
		System.out.println("Kaç Km yol yapıldı : ");
		int km = scanner.nextInt();
		
		
		double tutar = 10 + km*2.20 ;
		
		if(tutar<20) {
			System.out.println("Ödenecek Tutar 20 TL dir.");
		}
		else if(tutar>20) {
			System.out.println("Ödenecek Tutar : "+ tutar);
		}
		
		
		
		
	}

}
