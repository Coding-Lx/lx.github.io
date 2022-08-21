import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		int sum = 0;
		while (true) {
			//按行读取字符序列
			String numbersStr = myScanner.nextLine();
			//创建匹配器
			Pattern pattern = Pattern.compile("\\d");
			Matcher matcher = pattern.matcher(numbersStr);
			//逐个查找匹配字符序列
			while (matcher.find()) {
				//将每个数字字符转换为整型数值
				int number = Integer.parseInt(matcher.group(0));//group(0)是每次的整个匹配次序列
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
//                 char c = s.charAt(i);//获取第i个字符
//                 if(c!='-'&&c!='.')
//                 {
//                     int b=c-'0';
//                     sum+=b;//     +=就是强制转换；
 
//                 }
//             }
//             System.out.println(sum);
//         }
 
//     }
// }