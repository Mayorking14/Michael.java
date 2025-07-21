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

int largest = first;
if (second > largest) largest = second;
if (third > largest) largest = third;
if (fourth > largest) largest = fourth;
if (fifth > largest) largest = second;

int smallest = first;
if (second < smallest) smallest = second;
if (third < smallest) smallest = third;
if (fourth < smallest) smallest = fourth;
if (fifth < smallest) smallest = fifth;

System.out.println("Largest is " + largest);
System.out.println("Smallest is " + smallest);

}
}