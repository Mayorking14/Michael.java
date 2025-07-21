import java.util.Scanner;
public class PossitiveDiff{

public static void main(String[] arg){
Scanner scanner = new Scanner (System.in);

System.out.print("enter a number: ");
int number1 = scanner.nextInt();

System.out.print("enter a number: ");
int number2 = scanner.nextInt();

int difference = subtract(number1,number2);
System.out.print(difference);

}

public static int subtract(int number1,int number2){

int subtractor = Math.max (number1,number2);
int subtractee = Math.min (number1,number2);

int difference = subtractor - subtractee;
return difference;

 }


}