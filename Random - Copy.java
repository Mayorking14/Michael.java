import java.util.Scanner;
public class Random {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int num = (int) Math.random()*2;

 System.out.print("Enter a number 0(head) 0r 1(tail): ");
int value = input.nextInt();

if (value != num) {
System.out.println("invalid input, try again ode");
int again = input.nextInt();
}
else { 
System.out.println("  : " + num);
}

}
}