import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		//Ä¸´®
		String input = myScanner.nextLine();
		//²éÑ¯µÄµ¥´Ê
		String research = myScanner.nextLine();
		String pattern = "\\b" + research + "\\b";
		//Ìæ»»µÄµ¥´Ê
		String replacement = myScanner.nextLine();
		//Ìæ»»
		input = input.replaceAll(pattern, replacement);

		System.out.println(input);
	}
}

