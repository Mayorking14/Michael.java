import java.util.Scanner;
	public class Energy {
	public static void main(String[] arg){

	Scanner input = new Scanner(System.in);
	System.out.print("water in kilograms:");
	double kg = input.nextDouble();

	System.out.print("initial temperature:");
	double initials = input.nextDouble();
	
	System.out.print("final temperature:");
	double finals = input.nextDouble();

	double energy = kg * (finals - initials) * 4184;
	System.out.printf("The energy needed is %f", energy);
}
}