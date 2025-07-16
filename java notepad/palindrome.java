import java.util.Scanner;
public class Palindrome {
public static void main(String[] arg){

Scanner input = new Scanner (System.in);
System.out.print("enter number");
int number = input.nextInt();

int d1 = (number / 1000);
int d2 = (number % 1000)/100;
int d3 = (number % 100)/10;
int d4 = (number % 10);

if (number >= 1000 && number <= 9999) {
if (d1 == d4 && d2 == d3) {
System.out.print("number is a palindrome");
} 
else {
System.out.print("number is not a palindrome");
}
}
 else {
System.out.print("enter a valid palindrome number");
}

}
}