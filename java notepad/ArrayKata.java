import java.util.Arrays;

public class ArrayKata{
public static void main(String... args){
int[] ages = {67, 89, 45, 32, 56, 77};
System.out.println(Arrays.toString(squareNumbersIn(ages)));

}




public static int maximumIn(int[] numbers){

int maximum = numbers[0];

for(int index = 0; index < numbers.length; index++){

if (numbers[index] > maximum) maximum = numbers[index];

}
return maximum;
}




public static int minimumIn(int[] numbers){

int minimum = numbers[0];

for(int index = 0; index < numbers.length; index++){

if (numbers[index] < minimum) minimum = numbers[index];

}
return minimum;
}



public static int sumOf(int[] values){

int sum = 0;

for(int index = 0; index < values.length; index++){
sum += values[index];
}
return sum;
}



public static int sumOfEvenNumbersIn(int[] values){
int sumOfEven = 0;

for(int index = 0; index < values.length; index++)
if (values[index] % 2 == 0) {

	sumOfEven += values[index];
}
return sumOfEven;
}



public static int sumOfOddNumbersIn(int[] values){

int sumOfOdd = 0;

for(int index = 0; index < values.length; index++)
if (values[index] % 2 != 0) {

	sumOfOdd += values[index];
}
return sumOfOdd;
}



public static int[] maximumAndMinimumOf(int[] values){

int maximum = values[0];
int minimum = values[0];

for(int index = 0; index < values.length; index++){

if (values[index] > maximum) maximum = values[index];
if (values[index] < minimum) minimum = values[index];
}
int[] maxmin = {maximum, minimum};
return maxmin;
}



public static int noOfOddNumbersIn(int[] numbers){
int noOfOdd = 0;
for (int index = 0; index < numbers.length; index++){

if (numbers[index] % 2 != 0)
 noOfOdd++;

}
return noOfOdd;

}



public static int noOfEvenNumbersIn(int[] numbers){
int noOfOdd = 0;
for (int index = 0; index < numbers.length; index++){

if (numbers[index] % 2 == 0)
 noOfOdd++;

}
return noOfOdd;

}





public static int[] evenNumbersIn(int[] values){

int[] evenNumbers = new int[]

for(int index = 0; index < values.length; index++){
if(values[index] % 2 == 0)
evenNumbers = values[index]; 

}
return evenNumbers;

}





public static int[]  oddNumbersIn(int[] numbers){

int count = 0;

for(int index = 0; index < numbers.length; index++){
if(numbers[index] % 2 != 0)
	count++;
}
int[] oddNumber = new int[count];
int counter = 0;
for(int index = 0; index < numbers.length; index++){
if (numbers[index] % 2 != 0) {
	oddNumber[counter] = numbers[index];
	counter++;
}
}
return oddNumber;

}




public static int[] squareNumbersIn(int[] numbers){
int[] arraySquareNumbers = new int[]

for(int count = 0; count < numbers.length; count++){
arraySquareNumbers = numbers[count] ** 2;


}
return arraySquareNumbers;
}


}