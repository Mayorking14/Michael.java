import java.util.Scanner;
public class Quotient{

public static void main(String[] arg){
Scanner scanner = new Scanner (System.in);

System.out.print("enter a number: ");
int number1 = scanner.nextInt();

System.out.print("enter a number: ");
int number2 = scanner.nextInt();

float result = divide(number1,number2);
System.out.println(result);
}

public static float divide(int number1, int number2){
if (number2 == 0){
return 0;
}
float result = (float) number1 / number2;
return result;

}
}