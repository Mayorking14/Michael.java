import java.util.Scanner;
public class EvenBoolean {
public static void main (String[] arg){

Scanner input = new Scanner (System.in);

System.out.print("enter a number-> ");
int number = input.nextInt();

boolean even = isEven(number);
System.out.print(even);
}

public static boolean isEven(int number){
if (number % 2 == 0) {
return(true);
}
else  {
return(false);
}

}

}