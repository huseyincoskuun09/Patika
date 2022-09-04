import java.util.Scanner;

public class Main {
	
	public static int ebobBulma(int sayı1 , int  sayı2 ) {
		
		int ebob = 1 ; 
		
		for(int i = 1 ; i<= sayı1 && i<= sayı2 ; i++) {
			
			if((sayı1 % i == 0) && (sayı2%i == 0) ) {
				
				ebob = i ;
			}
		}
		return ebob ;
		
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci sayıyı Giriniz : ");
		int gırıs1  = scanner.nextInt() ; 
		System.out.println("İkinci Sayıyı Giriniz : ");
		int gırıs2 = scanner.nextInt();
		
	
		
		System.out.println("Sayıların EBOB değeri : "+ebobBulma(gırıs1,gırıs2));
	}

}
