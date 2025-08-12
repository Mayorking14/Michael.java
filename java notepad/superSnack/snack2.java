import java.util.Scanner;
public class snack2{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.print("Enter pet name: ");
String favoritePet = input.nextLn();

System.out.print(choosePet(favoritePet));



}


public static String choosePet(String pet) {


if (pet.equals("dogs") || pet.equals("cats"))
	System.out.print("Woof! Dogs are awesome!");
}
	else{
		System.out.print("Cool choice, but i love dogs!");


}
return pet;
}

