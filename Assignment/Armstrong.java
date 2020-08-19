import java.util.*;

class Armstrong{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String s=""+n;
        int len=s.length();

        int temp=n;
        int sum=0;

        while(n!=0){

            int rem=n%10;
            sum+=(int)Math.pow(rem,len);
            n=n/10;
        }

        if(sum==temp)
        System.out.println("YES");
        else
        System.out.println("NO");



    }
}