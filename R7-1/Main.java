import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		int sum = 0;
		while (true) {
			//���ж�ȡ�ַ�����
			String numbersStr = myScanner.nextLine();
			//����ƥ����
			Pattern pattern = Pattern.compile("\\d");
			Matcher matcher = pattern.matcher(numbersStr);
			//�������ƥ���ַ�����
			while (matcher.find()) {
				//��ÿ�������ַ�ת��Ϊ������ֵ
				int number = Integer.parseInt(matcher.group(0));//group(0)��ÿ�ε�����ƥ�������
				sum += number;
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}


// import java.util.Scanner;
 
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         while(sc.hasNextLine()){
//             String s = sc.nextLine();
//             int sum= 0;
//             for(int i=0;i<s.length();i++)
//             {
//                 char c = s.charAt(i);//��ȡ��i���ַ�
//                 if(c!='-'&&c!='.')
//                 {
//                     int b=c-'0';
//                     sum+=b;//     +=����ǿ��ת����
 
//                 }
//             }
//             System.out.println(sum);
//         }
 
//     }
// }