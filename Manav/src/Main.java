import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double Armut = 2.14 ;
		double Elma = 3.67 ;
		double Domates = 1.11 ;
		double Muz = 0.95 ;
		double Patlıcan  = 5.00 ;
		
		System.out.println("Armut : ");
		int armut_kılo = scanner.nextInt();
		System.out.println("Elma : ");
		int elma_kılo = scanner.nextInt();
		System.out.println("Domates : ");
		int domates_kılo = scanner.nextInt();
		System.out.println("Muz : ");
		int muz_kılo = scanner.nextInt();
		System.out.println("Patlıcan : ");
		int patlıcan_kılo = scanner.nextInt();
		
		double toplam = (Armut*armut_kılo) + (Elma*elma_kılo) +(Domates*domates_kılo)+(Muz*muz_kılo)+(Patlıcan*patlıcan_kılo) ;
		
		System.out.println(toplam);
		
	}

}
