public class Task6{
public static void main(String... args){


for(int count = 1; count <= 10; count++){
	int multiples = 1;
for (int counter = 1; counter <= 5; counter++){
	if (count % 4 == 0 && count != 8){
	multiples *= 4;
System.out.print(multiples);
}
 }
}
for(int counter = 1; counter <= 10; counter++){
	int secondMultiples = 1;
if (counter % 4 == 0 && counter != 4){
	secondMultiples *= 4;
	System.out.print(secondMultiples);
}
}
}
}