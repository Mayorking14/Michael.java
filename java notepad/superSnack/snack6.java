import java.util.Scanner;
public class snack6{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.print("Enter number: ");
int[] numbers = new int [15];

for(int count = 0; count < numbers.length; count++){

System.out.print("Enter number: ");
 numbers[count] = input.nextInt();

System.out.print(getMultiplesOf3(numbers));

}


public static int getMultiplesOf3(numbers){

int[] multiples = {}

for(let count = 1; count <= 15; count++){

if(count % 3 == 0){

multiples.push(count)
}

}
return multiples
}



