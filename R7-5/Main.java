import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		//����
		String str = myScanner.nextLine();
		//���÷ָ���
		String delimeter = " ";
		//���ַ����зָ��õ������ַ�����
		String []numbersStr = str.split(delimeter);
		//���ַ�����ת��Ϊ��ֵ����
		int []numbers = new int[numbersStr.length];
		for (int i=0; i<numbersStr.length; i++) {
			numbers[i] = Integer.parseInt(numbersStr[i]);
		}

		//��������ʽ���ԭʼ��
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		//��������滻
		//���������С�±�
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
		// System.out.println("������С�±�ֱ��ǣ�"+maxIndex+"  "+minIndex);
		//�滻
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
		
		//��������ʽ����滻���
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}
}

