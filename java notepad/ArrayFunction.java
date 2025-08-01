import java.util.Scanner;

public class ArrayFunction{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);


System.out.print("enter an integer > ");
int number = scanner.nextInt();

System.out.print("enter values > ");
int[] values = new int[7];

for(int i = 0; i < values.length; i++){
System.out.print("enter values > ");
values[i] = scanner.nextInt();

}



System.out.print(numberfrequency(number,values));
}

public static int numberfrequency(int number, int[] values){

int frequency = 0;

for(int count = 0; count < values.length; count++){

if (number == values[count]) {
	frequency += 1;}

}
	return frequency;
}

}