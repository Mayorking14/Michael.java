import java.util.Scanner;

public class PositiveNegativeZero {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int positive = 0;
int negative = 0;
int zero = 0;
int number;
int choice; // 1 to continue, 0 to stop

   do {
  System.out.print("Enter a number: ");
  number = input.nextInt();

   if (number > 0) {
   positive++;
   } else if (number < 0) {
   negative++;
   } 
	else {
	 zero++;
}

System.out.print("Do you want to enter another number? (1 for Yes, 0 for No): ");
 choice = input.nextInt();

} while (choice == 1);

 System.out.println("\nResults:");
System.out.println("Positive numbers: " + positive);
 System.out.println("Negative numbers: " + negative);
System.out.println("Zeros: " + zero);
 }
}