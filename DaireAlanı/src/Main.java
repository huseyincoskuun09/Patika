import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Dairenin yarı çapı nedir : ");
		int yarıcap = scanner.nextInt();
		System.out.println("Dairenin merkez açısı nedir : ");
		int merkezacı = scanner.nextInt();
		
		double formul = (Math.PI*(yarıcap*yarıcap)*merkezacı)/360 ;
		System.out.println(formul);
	}

}
