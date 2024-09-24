import java.util.Scanner;

public class Belowtrianglepattern {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i,j;
        for(i=a;i>=1;i--){
            for(j=1;j<a;j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
//This is not correct try this 28th problem
