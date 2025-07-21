import java.util.Scanner;
public class NumberOfFactor {

public static void main(String[] arg) {
Scanner scanner = new Scanner (System.in);

System.out.print("enter a number: ");
int number = scanner.nextInt();

int factor = factorOf(number);
System.out.print(factor);
}


public static int factorOf(int number){
int factor = 0;
int f = 1;
for(f = 1; f <= number; f++){

if (number % f == 0){
   factor++;
}


}

return factor;
 }
}