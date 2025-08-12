import java.util.Scanner;
public class snack10{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.print("Enter number: ")
int[] number = new int [5];

for(int count = 0; count <= number.length; count++){

System.out.print("Enter number: ")
number = input.nextInt(); 

System.out.print(squareNumber(number));

}


public static int squareNumber(int numbers){

for(numbers = 1; numbers < 6; numbers++){
		int numbers1 = numbers * numbers
	System.out.print(numbers +  " squared is " + numbers1)
}
return numbers
}