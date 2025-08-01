import java.util.Scanner;
public class Nokia20 {
public static void main(String[] arg){

System.out.print(menu());
System.out.print(phoneBook());



}

public static int menu(){
Scanner inputCollector = new Scanner(System.in);

System.out.println("Welcome to Nokia");

System.out.println(  """
		
	List of menu
		
		1:Phone book
		2:Messages
		3:Chat
		4:Call register
		5:Tones
		6:Settings
		7:call divert
		8:Games
		9:Calculator
		10:Reminders
		11:Clock
		12:Profiles
		13:SIM services
"""); 
	System.out.println("choose from the menu");
	int userinput = inputCollector.nextInt();
	

switch(userinput) {
	case 1 :
public static int phoneBook(){
Scanner inputCollector = new Scanner(System.in);
	System.out.println( """
			Phone book

			1.search
			2.service Nos.
			3.Add name
			4.Erase
			5.Edit
			6.Assign tone
			7.send b'card
			8.Options
			9.Speed Dials
			10.voice Tags
 			0.Back to menu
""");
	
	System.out.println("Enter to pick an option");
	int phoneBookOptions = inputCollector.nextInt();
	
switch (phoneBookOptions){
case 1:
System.out.println("Search");
break;

case 2:
System.out.println("Search Nos");
break;

case 3:
System.out.println("Add name");
break;

case 4:
System.out.println("Erase");
break;

case 5:
System.out.println("Edit");
break;

case 6:
System.out.println("Assign tone");
break;

case 7:
System.out.println("Send b' card");
break;

case 8:
System.out.println("""
		options
1.Type of view
2.Memory status
3.Go back
""");
System.out.println("Select option");
int options = inputCollector.nextInt();

switch (options) {
case 1:
System.out.println("Type of view");
break;

case 2:
System.out.println("Memory status");
break;

case 3:
phoneBook();
break;
}
break;
}

case 9:
System.out.println("Speed dials");
break;

case 10:
System.out.println("Voice tags");
break;

case 0:
menu();
break;
}
}
}
return userinput;
return phoneBookOptions;



}
}