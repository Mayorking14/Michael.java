import java.util.Scanner;
public class snack11{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.print("Enter number: ")
int[] number = new int [5];

for(int count = 0; count <= number.length; count++){

System.out.print("Enter Number: ")
number = input.nextInt(); 

System.out.print(decideNumber(number));

}


public static String decideNumber(int number){

if(number > 0){
System.out.print("positive!")
}
	else{
System.out.print("Negative!")
}
return number
}