import java.util.Scanner;
public class Variable {
public static void main(String[] arg){

Scanner input = new Scanner(System.in);
System.out.print("Enter integer for a:");
int value_a = input.nextInt();

System.out.print("Enter integer for b:");
int value_b = input.nextInt();

int a = value_b;
int b = value_a;
System.out.printf("%s%n%d%n%d%n two values of variables swapped is","a = value_b","b = value_a");
}
}