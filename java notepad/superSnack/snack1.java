
import java.util.Scanner;
public class snack1{
public static void main(String... args){

Scanner input = new Scanner(System.in);
System.out.print("Enter name: ");
String name = input.next();

System.out.print(chooseGreeting(name));
}


public static String chooseGreeting(String name) {

if(name.equals("alex")){ 

System.out.print("Hello, friend!");

} else {
	
	System.out.print("Hi,stranger!"); 
}
return name;

}
}
 