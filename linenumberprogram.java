import java.util.Scanner;

public class linenumberprogram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=1;
        while(s.hasNext()){
            String sc=s.nextLine();
            System.out.println(i+" "+sc);
            i++;
        }
        s.close();
    }
}
