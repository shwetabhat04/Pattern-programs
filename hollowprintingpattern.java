import java.util.Scanner;

public class hollowprintingpattern {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=0;j<=a;j++){
                if(i==0||i==a||j==0||j==a){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
