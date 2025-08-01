import java.util.Scanner;
public class PrimeNumber {
public static void main (String[] arg){

Scanner input = new Scanner (System.in);

System.out.print("enter a number > ");
int prime = input.nextInt();

Kata.isPrime(prime);
}
}