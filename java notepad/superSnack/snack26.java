import java.util.Scanner;
public class snack23{
public static void main(String... args){
Scanner input = new Scanner(System.in);


String triangle;

System.out.print(createTriangle(triangle));

}


public static void createTriangle(String triangle){

int starsCount = 1

for (int line = 1; line <= 5; line++) {
String stars = ""
for (int star = 0; star < starsCount; star++) {
        stars += "*"
}
System.out.print(stars)

starsCount++; 
}

}
