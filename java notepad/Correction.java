import java.util.Arrays;
public class Correction{
public static void main(String... args){

int[] num = {78, 2, 4, 5, 6};
System.out.print(Arrays.toString(squareNumbersIn(num)));

}











public static int[] squareNumbersIn(int[] numbers){
int[] arraySquareNumbers = new int[numbers.length];

for(int count = 0; count < numbers.length; count++){

arraySquareNumbers[count] = numbers[count] * numbers[count];


}
return arraySquareNumbers;
}


}
