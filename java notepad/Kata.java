public class Kata {
public static void main(String[] arg){

}
//Method 1

public static boolean isEven(int number){
if (number % 2 == 0) {
return(true);
}
else  {
return(false);
}

}

//Method 2

public static boolean isPrime(int number){
for (int p = 2; p <= Math.sqrt(number);p++){
if (number % p == 0) {
  System.out.print("false");
}
}

if (number <= 1) {
System.out.print("false");
}
return true;
}

//Method 3

public static int subtract(int number1,int number2){

int subtractor = Math.max (number1,number2);
int subtractee = Math.min (number1,number2);

int difference = subtractor - subtractee;
return difference;

 }


//Method 4

public static float divide(int number1, int number2){
if (number2 == 0){
return 0;
}
float result = (float) number1 / number2;
return result;

}

//Method 5

public static int factorOf(int number){
int factor = 0;
int f = 1;
for(f = 1; f <= number; f++){

if (number % f == 0){
   factor++;
}


}

return factor;
 }


//Method 6

public static int factorialOf(int number){
int f = 1;
int factor = 1;
while(f <= 5) {
factor = factor * f;
f++;
}
System.out.print(factor);
return number;
} 

//Method 7

public static int squareOf(int number) {
  
int result = number * number ;
return result;

}

//Method 8

public static boolean isSquare(int number){
if (Math.sqrt(number) * Math.sqrt(number) == number){
return (true);
}
else{
return (false);
}
}

}