import java.util.Scanner;
public class Kilogram {
public static void main(String[] arg){

Scanner input;
input = new Scanner(System.in);

System.out.print("No. in pounds");
double pounds = input.nextDouble();

System.out.print("KG per one pound");
double kg_per_pound = input.nextDouble();

double kilogram = pounds * kg_per_pound;
System.out.printf("55.5 pounds is %f", kilogram);
}
}