import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		//�����ַ����е�String����
		String input = myScanner.nextLine();
		//��'��'Ϊ�ָ������õ������ַ�������
		String delimeter = "��";	
		String []info = input.split(delimeter);

		for (int i=0; i<info.length; i++) {
			System.out.println(info[i]);
		}		

		//���ַ������еķ������ַ������滻Ϊ"#"
		String pattern = "[^0-9]+";
		//�½�һ��String����洢�滻���Input
		String replacedInput = input.replaceAll(pattern, "#");

		// System.out.println(replacedInput);//#34#56#20
		//��"#"Ϊ�ָ����õ������ַ����е�String����
		String []numbers = replacedInput.split("#");
		//�������е�ÿ�������ַ�����ת��Ϊ���Ͳ����
		int sum = 0;

		// System.out.println(Integer.parseInt(numbers[1]));//��ȷ
		// System.out.println(Integer.parseInt(numbers[0]));//��λ����Ϊ#34#56#20��#�ָ�����߲����ַ��Ŀ��ַ������Կ���һ�����ʴ浽numbers[0]����

		for (int i=1; i<numbers.length; i++) {
			sum += Integer.parseInt(numbers[i]);
			// System.out.println(numbers[i]);
			// System.out.println(Integer.parseInt(numbers[i]));
		}		

		System.out.println("�ܼ۸�Ϊ"+sum);		
		
	}
}

