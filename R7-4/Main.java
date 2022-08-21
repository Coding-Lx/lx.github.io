import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		int count = 0;
		//输入字符序列的String对象
		String input = myScanner.nextLine();
		//设置Pattern
		//英文字符
		String regex_01 = "[a-zA-Z]";
		//空格字符
		String regex_02 = " "; //" "表示空格字符
		//数字字符
		String regex_03 = "[\\d]";
		//其他字符
		String regex_04 = "[^a-zA-Z \\d]";

		Pattern pattern = Pattern.compile(regex_01);
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			count += 1;
		}
		System.out.println("字母个数："+count);

		count = 0;
		pattern = Pattern.compile(regex_03);
		matcher = pattern.matcher(input);
		while (matcher.find()) {
			count += 1;
		}
		System.out.println("数字个数："+count);

		count = 0;
		pattern = Pattern.compile(regex_02);
		matcher = pattern.matcher(input);
		while (matcher.find()) {
			count += 1;
		}
		System.out.println("空格个数："+count);

		count = 0;
		pattern = Pattern.compile(regex_04);
		matcher = pattern.matcher(input);
		while (matcher.find()) {
			count += 1;
		}
		System.out.println("其他字符个数："+count);



		
	}
}

