import java.util.Scanner;
public class Factorial{
public static void main(String... arg){

Scanner scanner = new Scanner (System.in);

System.out.print("enter an integer: ");
int number = scanner.nextInt();

int factor = factorialOf(number);
System.out.print(factor);
 }

public static int factorialOf(int number){
int f = 1;
int factor = 1;
while(f <= 5) {
factor = factor * f;
f++;
}
System.out.print(factor);
return number;
} 


}