import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		int count = 0;
		//�����ַ����е�String����
		String input = myScanner.nextLine();
		//����Pattern
		//Ӣ���ַ�
		String regex_01 = "[a-zA-Z]";
		//�ո��ַ�
		String regex_02 = " "; //" "��ʾ�ո��ַ�
		//�����ַ�
		String regex_03 = "[\\d]";
		//�����ַ�
		String regex_04 = "[^a-zA-Z \\d]";

		Pattern pattern = Pattern.compile(regex_01);
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			count += 1;
		}
		System.out.println("��ĸ������"+count);

		count = 0;
		pattern = Pattern.compile(regex_03);
		matcher = pattern.matcher(input);
		while (matcher.find()) {
			count += 1;
		}
		System.out.println("���ָ�����"+count);

		count = 0;
		pattern = Pattern.compile(regex_02);
		matcher = pattern.matcher(input);
		while (matcher.find()) {
			count += 1;
		}
		System.out.println("�ո������"+count);

		count = 0;
		pattern = Pattern.compile(regex_04);
		matcher = pattern.matcher(input);
		while (matcher.find()) {
			count += 1;
		}
		System.out.println("�����ַ�������"+count);



		
	}
}

