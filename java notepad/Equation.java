import java.util.Scanner;
public class Equation {
public static void main(String[] arg){

Scanner input = new Scanner(System.in);
System.out.print("enter value for a:");
double a = input.nextDouble();

System.out.print("enter value for b:");
double b = input.nextDouble();

System.out.print("enter value for c:");
double c = input.nextDouble();

double discriminant = (b * b - 4 * a * c);
if (discriminant >= 0) {

double xi = (-b + Math.sqrt(discriminant)) / (2 * a);
double xii = (-b - Math.sqrt(discriminant)) / (2 * a);


System.out.printf("xi is %f while xii is %f", xi, xii);
}
 else {
System.out.print("There is no root for this");}

}
}