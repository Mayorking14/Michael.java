import java.util.Scanner;
public class Leap {
public static void main(String[] arg){

Scanner input = new Scanner (System.in);

System.out.print("Enter year:");
int year = input.nextInt();

if (year >= 1000 && year <= 9999) { 
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	System.out.print("it is a leap year"); 
} else {
System.out.print("this is not a leap year");
} 
}
else {
System.out.print("invalid input");
}


}
}