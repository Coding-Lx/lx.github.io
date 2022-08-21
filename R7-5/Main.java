import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		//输入
		String str = myScanner.nextLine();
		//设置分隔符
		String delimeter = " ";
		//将字符序列分隔得到数字字符数组
		String []numbersStr = str.split(delimeter);
		//将字符数组转换为数值数组
		int []numbers = new int[numbersStr.length];
		for (int i=0; i<numbersStr.length; i++) {
			numbers[i] = Integer.parseInt(numbersStr[i]);
		}

		//以数组形式输出原始的
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		//数组查找替换
		//获得最大和最小下标
		int maxIndex = 0;
		int minIndex = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[maxIndex] < numbers[i]) {
				maxIndex = i;
			}
			if (numbers[minIndex] > numbers[i]) {
				minIndex = i;
			}
		}
		// System.out.println("最大和最小下标分别是："+maxIndex+"  "+minIndex);
		//替换
		int temp = 0;
		if (maxIndex != 0) {
			temp = numbers[maxIndex];
			numbers[maxIndex] = numbers[0];
			numbers[0] = temp;
		}

		if (minIndex != numbers.length-1) {
			temp = numbers[minIndex];
			numbers[minIndex] = numbers[numbers.length-1];
			numbers[numbers.length-1] = temp;			
		}
		
		//以数组形式输出替换后的
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}
}

