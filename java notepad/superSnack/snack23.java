import java.util.Scanner;
public class snack23{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.print = ("Enter score: ")
int score = input.nextInt();

System.out.print(calculateGrade(score));

}


public static String calculateGrade(int score){


for(numbers = 1; numbers < 11; numbers++){
		if (score >= 90){
System.out.print("A!");
}
else if (score >= 80){
System.out.print("B!");
}
else if (score >= 70){
System.out.print("C!");
}
else{
System.out.print("F!")
}

}
return score;
}