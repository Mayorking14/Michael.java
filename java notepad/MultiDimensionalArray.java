import java.util.Arrays;

public class MultiDimensionalArray{
public static void main(String... args){
int[][] values = {{50,10},{7,9},{40,10}};
for(int row = 0; row < values.length;row++) {
for(int column = 0; column < values[row].length;column++){
System.out.println(values[row][column]);
}
	System.out.println(Arrays.toString(values[row]));
}

}
}