import java.util.Scanner;

public class IT24103868Lab3Q1B {
  public static void main(String[]args) {
    
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the total bill amount: ");
	double totalBill = scanner.nextDouble();
	
	double discount = totalBill*0.10;
	
	double finalAmount = totalBill - discount;
	
	System.out.printf("Amount to be paid after 10% discount: %.2f\n",finalAmount);
	
	scanner.close();
   }
}
  
   