import java.util.Scanner;

public class IT24103868Lab3Q4 {
  public static void main(String[]args) {
	 
        Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a five-digit number :");
	int number = scanner.nextInt();

        String numStr =Integer.toString(number);
     
        System.out.print(numStr.charAt(0)+" "+
       
        numStr.charAt(1)+" "+
        numStr.charAt(2)+" "+
        numStr.charAt(3)+" "+
        numStr.charAt(4));
     }

}