public class test {
	public static void main (String args[]) {
		String a = "Tom_1,��,19,����";
		int number = 0;
      	for (int k=0; k<a.length(); k++) {
        	if (a.regionMatches(k, "����", 0, 2)) {
            	number = 1; 
            }
      	}
      	System.out.println(number);
	}
}