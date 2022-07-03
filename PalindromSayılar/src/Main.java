import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        String strNum = Integer.toString(num);
        String revStrNum = "";
        
        for (int i=0; i<strNum.length(); i++) {
            revStrNum += strNum.charAt(strNum.length() - 1 - i);
        }
        
        if (strNum.equals(revStrNum)) {
            System.out.print(num + " is a palindrome number.");
        } else {
            System.out.print(num + " is not a palindrome number.");
        }
    }
}
