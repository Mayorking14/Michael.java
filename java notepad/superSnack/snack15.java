import java.util.Scanner;
public class snack15{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.print("Enter Animal: ")
String animal = input.nextLn();
 
System.out.print(guessAnimal(animal));

}


public static String guessAnimal(animal){

String myAnimal = "dog";

if(animal.equals("dog")){
console.log("Correct! it's a dog!")
}
else{
console.log("Nope, it's a dog!")
}
return animal
}
