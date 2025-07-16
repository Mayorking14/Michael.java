import java.util.Scanner;
public class LargestSmallest {
public static void main(String[] arg){

Scanner input = new Scanner(System.in);
System.out.print("Enter first number:");
int first = input.nextInt();

System.out.print("Enter second number:");
int second = input.nextInt();

System.out.print("Enter third number:");
int third = input.nextInt();

System.out.print("Enter fourth number:");
int fourth = input.nextInt();

System.out.print("Enter fifth number:");
int fifth = input.nextInt();

int largest = second;
if (first > second) largest = first;
if (third > second) largest = third;
if (fourth > second) largest = fourth;
if (fifth > second) largest = second;

int smallest = first;
if (second < first) smallest = second;
if (third < second) smallest = third;
if (fourth < third) smallest = fourth;
if (fifth < fourth) smallest = fifth;

System.out.printf("%d%n%dn", "largest","smallest");

}
}