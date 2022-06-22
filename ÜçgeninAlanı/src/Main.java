import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Üçgenin 1.kenarını Giriniz : ");
		int kenar1 = scanner.nextInt();
		System.out.println("Üçgenin 2.kenarını Giriniz : ");
		int kenar2= scanner.nextInt();
		System.out.println("Üçgenin 3.kenarını Giriniz : ");
		int kenar3 = scanner.nextInt();
		
		int u = (kenar1+kenar2+kenar3)/2 ;
		
		double alan = u*(u-kenar1)*(u-kenar2)*(u-kenar3) ;
		
		
		System.out.println(alan);
		
	}

}
