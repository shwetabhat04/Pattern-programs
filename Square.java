import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
         System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
