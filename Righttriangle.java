import java.util.Scanner;
class Righttriangle{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}