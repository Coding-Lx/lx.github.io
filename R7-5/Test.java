public class Test {
	public static void main(String args[]) {
		int numbers[] = {2, 9, 0, 10};

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
		System.out.println("最大和最小下标分别是："+maxIndex+"  "+minIndex);		
	}
}