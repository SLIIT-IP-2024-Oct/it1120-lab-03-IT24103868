import java.util.Scanner;


public class IT24103868Lab3Q2 {

  public static void main(String[]args) {


    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the monthly salary;");
    int monthlySalary = scanner.nextInt();

    System.out.print("Enter the number of OT hours:");
    int otHours = scanner.nextInt();

    System.out.print("Enter the OT hourly rate");
    int otRate = scanner.nextInt();

    int otAmount = otHours * otRate;
    int totalSalary = monthlySalary + otAmount;

   System.out.println("The total salary including OT is:" + totalSalary);

    scanner.close();
  }
}






    
      

    

    



 