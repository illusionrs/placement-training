import java.util.*;

class BinaryToDecimal{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int base=1;

        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=(rem*base);
            base*=2;
            n=n/10;
        }

        System.out.println(sum);
    }
}