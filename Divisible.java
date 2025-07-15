import java.util.Scanner;
public class Divisible {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter first integer");
int first = input.nextInt();

System.out.print("Enter second integer");
int second = input.nextInt();

System.out.print("Enter third integer");
int third = input.nextInt();

System.out.print("Enter fourth integer");
int fourth = input.nextInt();

System.out.print("Enter fifth integer");
int fifth = input.nextInt();

int Largest = first;

if ( second > Largest) {Largest = second;};
if ( third > Largest) {Largest = third;};
if ( fourth > Largest) {Largest = fourth;};
if ( fifth > Largest){ Largest = fifth;};

int Smallest = first;

if (second < Smallest) {Smallest = second;};
if (third < Smallest) {Smallest = third;};
if (fourth < Smallest) {Smallest = fourth;};
if (fifth < Smallest) {Smallest = fifth;};

System.out.println("Largest number is: " + Largest);

System.out.println("Smallest number is: " + Smallest);


}
}