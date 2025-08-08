import java.util.Arrays;
public class ArrayToString{

public static void main(String... args){


String array1 = "i love programming";


System.out.print(Arrays.toString(splitThis(array1)));

}


public static String[] splitThis(String word){
	String[] splittedWord = word.split(" ");
	return splittedWord;
k



}


}