import java.util.Scanner;
  public class Nokia03 {
    public static void main(String[] args){


 menu();

    }
public static void menu() {
 Scanner inputCollector = new Scanner(System.in);

 System.out.print("""

	   Welcome to Nokia 3310
	1.  Phonebook
	2.  Messages
	3.  Chat
	4.  Call register
	5.  Tones
	6.  Settings
	7.  Call divert
	8.  Games 
	9.  Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. Sim services 
	14. exit			""");

         System.out.println("Select option");
        int userInput = inputCollector.nextInt();

switch(userInput){
case 1:
      System.out.println("""
        PHONEBOOK
        1. Search
	2.  Service Nos
	3.  Add name
	4.  Erase
	5.  Edit
	6.  Assign tone
	7.  Send b'card
	8.  Option 
	9.  Speed dials
	10. Voice tags
	11. Exit
			                 """);
      System.out.println("Select option");
      int phoneBook = inputCollector.nextInt();

 
switch(phoneBook){
case 8:
        System.out.println("""
	Option Menu
        1. Type of view
        2. Memory status
			""");
}


case 11:
menu();
break;

case 2:
System.out.println("""
        Messages
        1. Write messages
	2. Inbox
	3. Outbox
	4. Picture messages
	5. Templates
	6. Smileys
	7. Message settings
	8. Info service 
	9. Voice mailbox number
	10. Service command editor
	11. Exit
				""");

        System.out.println("Select option");
        int messageInput = inputCollector.nextInt();

switch(messageInput){
case 7:
       System.out.println("""
        More settings
	1. Set
	2. Common
	3. Exit
		     """);
      System.out.println("Select option");
     int setInput = inputCollector.nextInt();
}
case 3:
menu();
break;

case 4:
System.out.println("""
        Call register 
        1. Missed calls
	2. Recieved calls
	3. Dialled numbers
	4. Erase recent call lists
	5. Show call duration
	6. Show call costs
	7. Call cost setting
	8. Prepaid credit
	9. Exit	
			    """);
         System.out.println("Select option");
        int callInput = inputCollector.nextInt();

switch(callInput){
case 5:
      System.out.println("""
        1. Last call duration4

	2. All calls duration
	3. Recieved calls duration
	4. Dialled calls duration
	5. Clear timers
			    """);
break;

case 6:
        System.out.println("""
        1. Last call cost
	2. All calls cost
	3. Clear counters	 
			    """);
break;

case 7:
        System.out.println("""
        1. call cost limit
	2. Show cost in		 
			    """);

break;

case 9:
menu();
break;
}

case 5:
       System.out.println("""
        Tones 
        1. Ringing tone
	2. Ringing volumes
	3. Incoming call alert
	4. Composer
	5. Message alert tone
	6. Keypad tones
	7. Warning and game tones
	8. Screen saver
	9. Vibrating alert
			    """);  

case 6: 
        System.out.println("""
        Settings 
        1. Call settings
	2. Phone settings
	3. Security settings
	4. Restore factory settings
	5. Exit	
			    """);
  System.out.println("Select option");
  int settingInput = inputCollector.nextInt();

switch(settingInput){
case 1:
        System.out.println("""
	Call settings
	1. Automatic redial
	2. Speed dialling
	3. Call waiting options
	4. Own number sending
	5. Phone line in use
	6. Automatic answer			
				""");	
	break;

case 2:
System.out.println("""
	Phone settings
	1. Language
	2. Cell info display
	3. Welcome note
	4. Network selection
	5. Lights
	6. Confirm SIM service actions			
				""");
break;

case 3:
        System.out.println("""
	Security settings
	1. PIN code request
	2. Call barring service
	3. Fixed dialling
	4. Closed user group
	5. Phone security
	6. Change access codes		
				""");
break;

case 5:
menu();
break;

case 11:
        System.out.println("""
	Clock
	1. Alarm clock
	2. Clock settings
	3. Date setting
	4. Stopwatch
	5. Countdown timer
	6. Auto update of date and time	
	7. Exit	
				        """);
        
System.out.println("Select option");
int clockInput = inputCollector.nextInt();


switch(clockInput){
case 7:
menu();
break;

}





}
 




}


}



}

