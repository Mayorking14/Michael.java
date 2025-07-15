import java.util.Scanner;
public class Multiples {
	public static void main(String[] arg){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number:");
	
	int numberInput = input.nextInt();

	if(numberInput % 6 == 0 || numberInput % 7 == 0) {
	System.out.printf("multiple of 6 or multiple of 7");
}

	else {
	System.out.print("neither a multiple of 6 or 7");
}

}
}