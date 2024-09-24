import java.util.Scanner;
public class Fulltriangle {
    public static void main(String[] args) {
    System.out.println("Enter the Number");
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    for (int i = 1; i <= a; i++) 
    {
        for (int j = 1; j <= a - i; j++) 
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i*2-1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    s.close();
 }
}
