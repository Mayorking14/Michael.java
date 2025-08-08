import java.util.Arrays;
public class AscendingArray{
public static void main(String... args){

int[] scores = {40, 35, 49, 57, 61, 44};

System.out.print(Arrays.toString(order(scores)));

}

public static int[] order(int[] scores){

int storeNumber = 0;

for(int count = 0; count < scores.length; count++){

for (int counter = count; counter < scores.length; counter++){

if (scores[count] > scores[counter]){

storeNumber = scores[counter];
scores[counter] = scores[count];
scores[count] = storeNumber;
}

}


}
return scores;


}

}