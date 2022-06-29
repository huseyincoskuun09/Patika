import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int kalan = 0  ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Turkish Note : ");
		int trk = scanner.nextInt();
		if(trk<0||trk>100){
            kalan++;
            trk=0;
        }
		System.out.println("Enter Your Math Note  : ");
		int mt = scanner.nextInt();
		if(mt<0||mt>100){
            kalan++;
            mt=0;
        }
		System.out.println("Enter Your Physics Note  : ");
		int fzk = scanner.nextInt();
		if(fzk<0||fzk>100){
            kalan++;
            fzk=0;
        }
		System.out.println("Enter Your Chemical Note : ");
		int kmy = scanner.nextInt();
		if(kmy<0||kmy>100){
            kalan++;
            kmy=0;
        }
		System.out.println("Enter Your Musıc Note : ");
		int mzk = scanner.nextInt();
		if(mzk<0||mzk>100){
            kalan++;
            mzk=0;
        }
		
		double avarage = ((trk+mt+fzk+kmy+mzk)/(5-kalan));
		
	
		
		
		if(avarage>55){
			System.out.println("You pass the class");
		}
		else {
			System.out.println("You Failed.");
		}
		
		System.out.println("Your Avarage : "+avarage);
		
	}

}
