import java.util.Scanner;
public class Nokia {
public static void main(String[] arg){
Scanner inputCollector = new Scanner(System.in);

System.out.println("Welcome to Nokia");
System.out.println(  """
		
	List of menu functions
		
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
	int menu = inputCollector.nextInt();
	
switch(menu) {
	case 1 :
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
""");
	
	System.out.println("Enter to pick an option");
	int phoneBook = inputCollector.nextInt();
	
switch (phoneBook){
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
""");
System.out.println("Select option");
int options = inputCollector.nextInt();

switch (options) {
case 1:
System.out.println("Type of view");
break;

case 2:
System.out.println("Memory status");
}
break;

case 9:
System.out.println("Speed dials");
break;

case 10:
System.out.println("Voice tags");
}
break;
	

	case 2 :
System.out.println("""
		Messages

		1.Write messages
		2.Inbox
		3.Outbox
		4.Picture messages
		5.Templates
		6.Smileys
		7.Messages
		8.Info service
		9.Voice mailbox number
		10.Service command editor
""");

  System.out.println("select option");
int inputMessages = inputCollector.nextInt();

switch (inputMessages) {
case 1 :
System.out.println("Write messages");
break;

case 2 :
System.out.println("inbox");
break;

case 3 :
System.out.println("outbox");
break;

case 4 :
System.out.println("Picture messages");
break;

case 5 :
System.out.println("Templates");
break;

case 6 :
System.out.println("smileys");
break;

case 8 :
System.out.println("Info service");
break;

case 9 :
System.out.println("Voice mailbox number");
break;

case 10:
System.out.println("Service command editor");
break;

case 7 :
System.out.println("""
	Message settings

	1.Set 1
	2.Common
""");
System.out.println("select option");
int messageOption = inputCollector.nextInt();

switch (messageOption) {
case 1 :
System.out.println("""
	Set 1
1.Message centre number
2.Mesages sent as
3.Message validity
""");
System.out.println("select option");
int setOption = inputCollector.nextInt();

switch (setOption) {
case 1:
System.out.println("Message centre number");
break;

case 2:
System.out.println("Messages sent as");
break;

case 3:
System.out.println("Message validity");
break;
}
break;

case 2 :
System.out.println("""
	Common

1.Delivery reports
2.Reply via same centre
3.Character support
""");
System.out.println("select option");
int commonOption = inputCollector.nextInt();

switch (commonOption) {
case 1:
System.out.println("Delivery reports");
break;

case 2:
System.out.println("Reply via same centre");
break;

case 3:
System.out.println("Character support");
break;
}
break;
}

}

case 3:
System.out.println("Chat");
break;

case 4 :
System.out.println("""
	Call register
1.Missed calls
2.Recieved calls
3.Dialled numbers
4.Erase recent call lists
5.Show call duration
6.Show call costs
7.call cost settings
8.Prepaid credit
""");
System.out.println("select option");
int inputCallRegister = inputCollector.nextInt();

switch (inputCallRegister) {
case 1 :
System.out.println("Missed calls");
break;

case 2 :
System.out.println("Recieved calls");
break;

case 3 :
System.out.println("Dialled numbers");
break;

case 4 :
System.out.println("Erase recent call lists");
break;

case 8 :
System.out.println("Prepaid credit");
break;

case 5 :
System.out.println("""
	Show call duration
1.last call duration
2.All calls' duration
3.Recieved calls' duration
4.Dialled calls' duration
5.Clear timers
""");
System.out.println("select option");
int inputCallDuration = inputCollector.nextInt();

switch (inputCallDuration) {
case 1 :
System.out.println("last call duration");
break;

case 2 :
System.out.println("All calls' duration");
break;

case 3 :
System.out.println("Recieved calls' duration");
break;

case 4 :
System.out.println("Dialled calls' cost");
break;

case 5 :
System.out.println("clear timers");
break;
}
break;

case 6 :
System.out.println("""
	Show call costs
1.Last call cost
2.All calls' cost
3.Clear counters
""");
System.out.println("choose option");
int callCosts = inputCollector.nextInt();

switch (callCosts) {
case 1 :
System.out.println("Last call cost");
break;

case 2 :
System.out.println("All calls' cost");
break;

case 3 :
System.out.println("Clear counters");
break;
}
break;

case 7 :
System.out.println("""
	Call cost settings
1.Call cost limit
2.Show costs in
""");
System.out.println("choose 1 or 2");
int callCostSettings = inputCollector.nextInt();

switch (callCostSettings) {
case 1 :
System.out.println("call cost limit");
break;

case 2 :
System.out.println("show costs in");
break;
}
}
break;

case 5 :
System.out.println("""
		Tones
1.Ringing tone
2.Ringing volume
3.Incomiong call alert
4.Composer
5.Message alert tone
6.Keypad tones
7.Warning and game tones
8.Vibrating alert 
9.Screen saver
""");
System.out.print("choose option");
int tones = inputCollector.nextInt();

switch (tones) {
case 1 :
System.out.print("Ringing tone");
break;

case 2 :
System.out.print("Ringing volume");
break;

case 3 :
System.out.print("Incoming call alert");
break;

case 4 :
System.out.print("composer");
break;

case 5 :
System.out.print("Message alert tone");
break;

case 6 :
System.out.print("Key pad tones");
break;

case 7 :
System.out.print("Warning and game tones");
break;

case 8 :
System.out.print("Vibrating alert");
break;

case 9 :
System.out.print("Screen saver");
break;
}
break;

case 6 :
 System.out.println("""
			Settings
		
		1.Call setings
		2.Phone settings
		3.Security settings
		4.Restore factory settings
""");
System.out.println("select option");
int inputSettings = inputCollector.nextInt();

switch (inputSettings) {
case 1 :
System.out.println("""
		Call settings
1.Automatic redial
2.Speed dialling
3.Call waiting options
4.Own number sending
5.Phone line in use
6.Automatic answer
""");
System.out.println("select option");
int callSettings = inputCollector.nextInt();

switch (callSettings) {
case 1 :
System.out.println("Automatic redial");
break;

case 2 :
System.out.println("Speed dialing");
break;

case 3 :
System.out.println("call waiting options");
break;

case 4 :
System.out.println("own number sending");
break;

case 5 :
System.out.println("phone line in use");
break;

case 6 :
System.out.println("Automatic answer");
break;
}
break;

case 2 :
System.out.println("""
		Phone settings

		  1.Language
		  2.Cell info display
		  3.Welcome note
		  4.Network selection
		  5.Lights^2
		  6.Confirm SIM service actions
""");
System.out.println("select option");
int phoneSettings = inputCollector.nextInt();

switch (phoneSettings) {
case 1 :
System.out.println("Language");
break;

case 2 :
System.out.println("cell info display");
break;

case 3 :
System.out.println("Welcome note");
break;

case 4 :
System.out.println("Network selection");
break;

case 5 :
System.out.println("Lights^2");
break;

case 6 :
System.out.println("Confirm SIM service actions");
break;
}
break;

case 3 :
System.out.println("""
		Security settings

		  1.PIN code request
		  2.Call barring service
		  3.Fixed dialling
		  4.Closed user group
		  5.Phone security
		  6.Change access codes
""");
System.out.println("select options");
int securitySettings = inputCollector.nextInt();

switch (securitySettings) {
case 1 :
System.out.println("PIN code request");
break;

case 2 :
System.out.println("Call barring service");
break;

case 3 :
System.out.println("Fixed dialling");
break;

case 4 :
System.out.println("Closed user group");
break;

case 5 :
System.out.println("Phone security");
break;

case 6 :
System.out.println("Change access codes");
break;
}
break;

case 4 :
System.out.println("Restore factory settings");
break;
}
break;

case 7 :
System.out.println("call divert");
break;

case 8 :
System.out.println("Games");
break;

case 9 :
System.out.println("Calculator");
break;

case 10 :
System.out.println("Reminders");
break;

case 11 :
System.out.println("""
		Clock
1.Alarm clock
2.Clock settings
3.Date setting
4.Stopwatch
5.Countdown timer
6.Auto updte of date and time
""");
System.out.println("select option");
int clock = inputCollector.nextInt();

switch (clock) {
case 1 :
System.out.println("Alarm clock");
break;

case 2 :
System.out.println("Clock settings");
break;

case 3 :
System.out.println("Date setting");
break;

case 4 :
System.out.println("Stopwatch");
break;

case 5 :
System.out.println("Countdown timer");
break;

case 6 :
System.out.println("Auto updte of date and time");
break;
}
break;

case 12 :
System.out.println("Profiles");
break;

case 13 :
System.out.println("SIM services");
break;

}

}

}



















		