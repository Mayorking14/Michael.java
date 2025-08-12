import java.util.Scanner;
public class snack21{
public static void main(String... args){
Scanner input = new Scanner(System.in);



int digit;

System.out.print(guessNumber(digit));

}


public static String guessNumber(int number){

int secret = 8;

if(number == secret ){
System.out.print("Correct!");
}
else{
System.out.print("Try again!");

}

return number;
}

}