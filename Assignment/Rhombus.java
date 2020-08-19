import java.util.*;

class Rhombus{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=4;i>=1;i--){

            for(int j=i;j>=1;j-- )
            System.out.print(" ");

            for(int j=1;j<=n;j++)
            System.out.print("*");

            System.out.println();
        }
    }
}