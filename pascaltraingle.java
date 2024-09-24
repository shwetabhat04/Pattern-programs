import java.util.Scanner;

public class pascaltraingle {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int m=a;
        int n=1;
        for(int i=0;i<a;i++){
            for(int j=1;j<=m;j++){
                System.out.print(" ");
            }
            n=1;
            for(int k=0;k<=i;k++){
                System.out.print(n+" ");
                n = n * (i - k) / (k + 1);
            }
            m--;
            System.out.println();
        }
        s.close();
    }
}
