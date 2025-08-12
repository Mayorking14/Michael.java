import java.util.Scanner;
public class snack13{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.print("Enter Age: ")
int ageEligibility = input.nextInt(); 

System.out.print(getRestriction(ageEligibility));

}


public static String getRestriction(int age){

int minimum = 10;
if(age >= minimum){
console.log("Welcom to the show!")
}
else{
console.log("Sorry, you're too young!")

}
return age
}