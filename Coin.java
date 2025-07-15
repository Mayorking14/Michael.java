import java.util.Scanner;

public class Coin {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
 
int coinFlip = (int) (Math.random() * 2);      
 
System.out.print("Guess the coin flip, enter 1 for Heads or 0 for Tails: ");
int guess = input.nextInt();

 int head = 1;
int tail = 0;

if (guess == coinFlip && coinflip == head){
 System.out.println("Correct! You guessed it right.");
}

else if (guess == coinFlip && coinflip == tail){
 System.out.println("incorrect! ");
}
else if{
guess == coinFlip && coinFlip != tail && head) {
System.out.println("invalid!");}

 else {
 System.out.println("Incorrect. The correct answer was " + coinFlip + ".");
 }
}
}
