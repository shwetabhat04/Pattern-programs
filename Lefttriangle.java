import java.util.Scanner;
public class Lefttriangle {
   public static void main(String[] args) {
    System.out.println("Enter the Number");
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    for (int i = 0; i < a; i++) {
        for (int j = i; j < a - 1; j++) {
            System.out.print(" "); 
        }
        for (int k = 0; k <= i; k++) {
            System.out.print("*"); 
        }
        System.out.println();
    }
    s.close();
}
}
