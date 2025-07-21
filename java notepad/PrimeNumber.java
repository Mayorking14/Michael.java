import java.util.Scanner;
public class PrimeNumber {
public static void main (String[] arg){

Scanner input = new Scanner (System.in);

System.out.print("enter a number > ");
int prime = input.nextInt();

boolean result =  isPrime(prime);
System.out.print(result);
}


public static boolean isPrime(int number){
for (int p = 2; p <= Math.sqrt(number);p++){
if (number % p == 0) {
  System.out.print("false");
}
}

if (number <= 1) {
System.out.print("false");
}
return true;
}
}