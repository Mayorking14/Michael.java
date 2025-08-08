import java.util.Scanner;
public class UpperCase{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.print("enter name:> ");
String name = input.next();

System.out.print(UpperString(name));


}




public static String UpperString(String name){

return name.toUpperCase();
}

}