import java.util.Scanner;
public class Quadratic {
public static void main(String[] arg) {

Scanner input = new Scanner(System.in);
System.out.print("enter value for a: ");
double a = input.nextDouble();

System.out.print("enter value for b: ");
double b = input.nextDouble();

System.out.print("enter value for c: ");
double c = input.nextDouble();

double determinant = (b * b) - 4 * a * c;
if(determinant >= 0) {

double x1 = (-b + Math.sqrt(determinant)) / (2 * a);

double x2 = (-b - Math.sqrt(determinant))/ (2 * a);
System.out.printf("x1 is %f while x2 is %f", x1, x2);
}

	else {
	System.out.printf("There is no root for this");
}

}
}