
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Implement interface here, we use later
interface robotLoading {
	void soundEffect();
}

public class Home implements robotLoading{
	
	
//Enums somewhere i will need these, but we move
	
enum myEnums {LOWBATTERY,
	HIGHSPEED,
	SLOW, 
	DONTWANTTODOIT, 
	IAMON
	
}

	public static void main (String[] args) {
		
		Robotwalk myRobot = new Robotwalk();
		// Implement if Statements

		if(!myRobot.canwalk) {System.out.println("This is a lazy Robot");
		
	}
		else {
		myRobot.blink(); 

	}
		// Implement Scanner - 
		/* we are going to ask you to input few commands
		* for the Robot to act or defy your orders * */
	
		Scanner roboScan = new Scanner(System.in);
		
		System.out.println("DISCLAIMER - This Robot will hurt your feelings because it "
		+ "doesnt know what to do with your heart");
		
		System.out.println("**********************************");
		
		System.out.println("**********************************");
		
		System.out.println("DO YOU WANT TO SWITCH ON THE ROBOT NOW?:" + "Y/N " );
		
		String  switchOnRobot = roboScan.next().toUpperCase(); 		// implement Regular Expression
		
		System.out.println(switchOnRobot);
		
		roboScan.close();
		
		String regexParam = "[Y]";
		
				String ToMatch = switchOnRobot; // While this will be Y= Bool (true), we are going to do crazy things
		Pattern myRegexPattern = Pattern.compile(regexParam);
		
		Matcher myRegexMatcher = myRegexPattern.matcher(ToMatch);
		
		boolean onOff = myRegexMatcher.matches();
		
// Crazy things like Threading this robot to do stuff IMPLEMENT THREAD
		
		do { System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "THIS RED LIGHT TO REMAIN ON" +
						ConsoleColors.RESET); // Supposed to show red, Eclipse is DUMB yerrr sies.
		
		myThread testThread = new myThread(); testThread.start();
		break;			
		
		}	
		while (onOff == true);
			
	}
	
	@Override
	public void soundEffect() { 
		
	/* I want to play Sci-Fi Music here, but I have exams to pass */ }
	
}
class myThread extends Thread {
		public void run() {
		System.out.println("Who let the Dogs Out? Who? Who?"); 
		}
	}

class ConsoleColors {   
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    
}
