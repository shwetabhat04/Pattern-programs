import java.util.Scanner;

public class fullnumbertraingle {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            for(int l=0;l<a-i;l++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+"");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k+"");
            }
           System.out.println();
        }
        s.close();
    }
}
