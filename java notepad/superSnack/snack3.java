import java.util.Scanner;
public class snack3{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.print("Enter number: ");
int favoriteNumber = input.nextInt();

System.out.print(guessNumber(favoriteNumber));

}


public static int guessNumber(int favoriteNumber) {

if(favoriteNumber == 7){

System.out.print("That’s my favorite number!");
}
	else {
System.out.print("Nice try, guess again!");
		
}
return favoriteNumber;
}

