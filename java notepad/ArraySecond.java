public class ArraySecond{
public static void main (String... arg){

int[4] array = [5,4,7,10,8]

int largest = 0;
int secondLargest = 0;

for (int count = 0; count < array.length; count++) {

if (array[count] > largest) {
largest = array[count];
}
}


}

}

