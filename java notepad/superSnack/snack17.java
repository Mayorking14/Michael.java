import java.util.Scanner;
public class snack17{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.print("Enter temp: ")
int temperature = input.nextInt();


System.out.print(checkTemperature(temperature));

}


public static String checkTemperature(int temperature){

if(temperature > 30){
System.out.print("Hot!")
}
else if(temperature <= 30){
System.out.print("Cold!")
}
return temperature
}
