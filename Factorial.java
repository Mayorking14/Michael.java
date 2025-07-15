import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
 
int factor = 1;

System.out.print("Enter a number: ");
int number = input.nextInt();

 if (number < 0) {
System.out.println("No Factor for negative numbers.");
 } else {
  for (int i = 1; i <= number; i++) {
 factor = factor * i;
 }

 System.out.println("Answer = " + result);
}
 }
}