import java.util.Scanner;
public class LeapYear {
public static void main(String[] arg){
Scanner input = new Scanner(System.in);

System.out.print("Enter a year:");
int year = input.nextInt();

if (year < 1000) {
System.out.print("invalid");

if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0);
System.out.print("this is a leap year");

else if (year % 4 != 0 && year % 100 == 0 && year % 400 != 0);
System.out.print("this is not a leap year");


}
}