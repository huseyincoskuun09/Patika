import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int temp;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Temperature: ");
        temp = input.nextInt();
        
        if (temp < 5) {
            System.out.print("Ski");
        } else if (5 <= temp && temp <15) {
            System.out.print("Cinema");
        } else if (temp == 15) {
            System.out.print("Both Cinema and Picnic");
        } else if (15 < temp && temp <=25) {
            System.out.print("Picnic");
        } else {
            System.out.print("Swimming");
        }
    }
}
