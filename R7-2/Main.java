import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		//ĸ��
		String input = myScanner.nextLine();
		//��ѯ�ĵ���
		String research = myScanner.nextLine();
		String pattern = "\\b" + research + "\\b";
		//�滻�ĵ���
		String replacement = myScanner.nextLine();
		//�滻
		input = input.replaceAll(pattern, replacement);

		System.out.println(input);
	}
}

