import java.util.*;

class MinSwap{

    public static void main(String[] args){
        int arr1[] = {2, 7, 9, 5, 8, 7, 4}; 
    
       int  k = 5; 


         System.out.println(Sol(arr1,k));
    }

    public static int Sol(int[] arr,int k){

        int count=0;

        for(int i=0;i<arr.length;i++)
        if(arr[i]<=k)
        count++;

        int bad=0;

        for(int i=0;i<count;i++)
        if(arr[i]>k)
        bad++;

        int ans=bad;

        for(int i=0,j=count;j<arr.length;j++,i++){

            if(arr[i]>k)
            --bad;

            if(arr[j]>k)
            ++bad;


            ans=Math.min(bad,ans);

        }

        return ans;
    }
}