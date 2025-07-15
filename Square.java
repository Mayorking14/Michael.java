import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        int square1 = number1 * number1;
        int square2 = number2 * number2;

        int sumOfSquares = square1 + square2;
        int differenceOfSquares = square1 - square2;

        System.out.println("Square of number1 is: " + square1);
        System.out.println("Square of number2 is: " + square2);
        System.out.println("Sum of the squares is: " + sumOfSquares);
        System.out.println("Difference of the squares: " + differenceOfSquares);
    }
}