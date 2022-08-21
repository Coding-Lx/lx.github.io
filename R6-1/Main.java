import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int HUMANNUM=10;
        String persons[]=new String[HUMANNUM];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<persons.length;i++)
            persons[i]=in.nextLine();
        int result=numofHan(persons);
        System.out.println(result);
    
    }
    
    public static int numofHan(String data[]) {
        int count = 0;
        for (int i=0; i<data.length; i++) {
            if (data[i].contains("汉族")){
                count++;
            }
            
        }
        return count;
    }

}

