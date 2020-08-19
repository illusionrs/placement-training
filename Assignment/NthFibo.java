import java.util.*;

class NthFibo{

    
        public static int fib(int N) {
            
            if(N==0)
                return 0;
            
            if(N==1 || N==2)
                return 1;
            
            
            int[] arr=new int[N];
            arr[0]=1;
            arr[1]=1;
            
            
            
            for(int i=2;i<N;i++)
                arr[i]=arr[i-1]+arr[i-2];
            
            return arr[N-1];
            
        }
    public static void main(String[] args){

        System.out.println(fib(8));
    }
}