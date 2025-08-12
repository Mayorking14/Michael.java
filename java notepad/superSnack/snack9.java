import java.util.Scanner;
public class snack9{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.print("Enter color: ")
String trafficLight = input.nextLn();

System.out.print(controlTraffic(trafficLight));

}


public static String controlTraffic(String trafficLight){

if(symbol == "red"){
	System.out.print("Stop")
}
if(symbol == "yellow"){
	System.out.print("Wait")	
}
if(symbol == "green"){
	System.out.print("Go")
}
return trafficLight
}