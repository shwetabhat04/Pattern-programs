import java.util.Scanner;

public class Righttrianglepattern {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<2*a;i++){
            int t=i>a?2*a-i:i;
            for(int j=0;j<t;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
