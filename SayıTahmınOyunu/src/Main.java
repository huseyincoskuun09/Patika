import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
        int number = random.nextInt(100) ;
        int right = 0 ;
        int[] wrong = new int[5] ;
        boolean isWin = false ;
        boolean isWrong = false ;
        
        
        System.out.println(number);
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
          int  selected = scanner.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                while (right < 5) {
                    System.out.print("Lütfen tahmininizi giriniz : ");
                    selected = scanner.nextInt();

                    if (selected < 0 || selected > 99) {
                        System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                        if (isWrong) {
                            right++;
                            System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                        } else {
                            isWrong = true;
                            System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                        }
                        continue;
                    }

                    if (selected == number) {
                        System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                        isWin = true;
                        break;
                    } else {
                        System.out.println("Hatalı bir sayı girdiniz !");
        

		
	}
        }
	}
}
	}
}


