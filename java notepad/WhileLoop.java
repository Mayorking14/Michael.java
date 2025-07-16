import java.util.Scanner;
public class WhileLoop {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int score = input.nextInt();

int Largest = score;
int secondLargest = -2147483648;
int count = 0;

while (count <= 4) {

System.out.print("Enter score :");
score = input.nextInt();

if (score > largest")
largest = score;

if (largest > score && score score > secondlrgest)
secondLargest = score;

count ++;
}
System.out.println("Largest is " + largest");
System.out.println("SecondLargest is " + secondLargest");

