import java.util.Scanner;
public class Alphabet {
	public static void main(String[] arg){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter an alphabet:");

	char letter = input.next().charAt(0);

	if(letter == 'a' || letter == 'A') {
	System.out.print("This is a vowel sound");
}
	else if(letter == 'e' || letter == 'E') {
	System.out.print("This is a vowel sound");
}
	else if(letter == 'i' || letter == 'I') {
	System.out.print("This is a vowel sound");
}
	else if(letter == 'o' || letter == 'O') {
	System.out.print("This is a vowel sound");
}
	else if(letter == 'u' || letter == 'U') {
	System.out.print("This is a vowel sound");
}
	else {
	System.out.print("This is a consonant");
}

}
}
