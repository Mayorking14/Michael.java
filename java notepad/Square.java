import java.util.Scanner;
public class Square {

public static void main(String[] arg) {
Scanner scanner = new Scanner (System.in);

System.out.print("enter a number: ");
int number = scanner.nextInt();

boolean square = isSquare(number);
System.out.print(square);
}

public static boolean isSquare(int number){
if (Math.sqrt(number) * Math.sqrt(number) == number){
return (true);
}
else{
return (false);
}


}
}
