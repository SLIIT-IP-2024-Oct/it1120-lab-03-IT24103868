import java.util.Scanner;

public class IT24103868Lab3Q3 {
 public static void main(String[]args) {
   
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the rupee amount: ");
    int amount =  scanner.nextInt();
   
    	int note5000=amount/5000;
	amount=amount%5000;
	System.out.println("5000 notes - " +note5000);

	int note1000=amount/1000;
	amount=amount%1000;
	System.out.println("1000 notes - " +note1000);

	int note500=amount/500;
	amount=amount%500;
	System.out.println("500 notes - " +note500);

	int note200=amount/200;
	amount=amount%200;
	System.out.println("200 notes - " +note200);

	int note100=amount/100;
	amount=amount%100;
	System.out.println("100 notes - " +note100);

	int note50=amount/50;
	amount=amount%50;
	System.out.println("50 notes - " +note50);

	int note20=amount/20;
	amount=amount%20;
	System.out.println("20 notes - " +note20);

	int note10=amount/10;
	amount=amount%10;
	System.out.println("10 notes - " +note10);

	int note5=amount/5;
	amount=amount%5;
	System.out.println("5 notes - " +note5);

	int note2=amount/2;
	amount=amount%20;
	System.out.println("20 notes - " +note20);

	int note1=amount/1;
	amount=amount%1;
	System.out.println("1 notes - " +note1);

    

     }
}
  

  