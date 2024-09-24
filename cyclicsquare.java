import java.util.Scanner;

public class cyclicsquare {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int o=a;
        a=2*a;
        for(int i=0;i<=a;i++){
            for(int j=0;j<=a;j++){
                int at=o-Math.min(Math.min(i,j),Math.min(a-i,a-j));
                System.out.print(at+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
