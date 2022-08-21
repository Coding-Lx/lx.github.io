import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		//输入字符序列的String对象
		String input = myScanner.nextLine();
		//以'；'为分隔符，得到数字字符的数组
		String delimeter = "；";	
		String []info = input.split(delimeter);

		for (int i=0; i<info.length; i++) {
			System.out.println(info[i]);
		}		

		//将字符序列中的非数字字符部分替换为"#"
		String pattern = "[^0-9]+";
		//新建一个String对象存储替换后的Input
		String replacedInput = input.replaceAll(pattern, "#");

		// System.out.println(replacedInput);//#34#56#20
		//以"#"为分隔符得到数字字符序列的String数组
		String []numbers = replacedInput.split("#");
		//将数组中的每个数字字符序列转换为整型并求和
		int sum = 0;

		// System.out.println(Integer.parseInt(numbers[1]));//正确
		// System.out.println(Integer.parseInt(numbers[0]));//错位，因为#34#56#20以#分隔，左边不含字符的空字符序列仍看作一个单词存到numbers[0]里面

		for (int i=1; i<numbers.length; i++) {
			sum += Integer.parseInt(numbers[i]);
			// System.out.println(numbers[i]);
			// System.out.println(Integer.parseInt(numbers[i]));
		}		

		System.out.println("总价格为"+sum);		
		
	}
}

