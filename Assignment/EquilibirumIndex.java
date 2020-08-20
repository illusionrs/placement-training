import java.util.*;

class EquilibirumIndex{

    public static void main(String[] args){

        int[] arr={-7, 1, 5, 2, -4, 3, 0};
        System.out.println(Sol(arr));

      
    }
    public static int Sol(int[] arr){

        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i];

        for(int i=0;i<arr.length;i++){
 
 leftsum = 0;  
 for (j = 0; j < i; j++) 
     leftsum += arr[j]; 

 
 rightsum = 0;  
 for (j = i + 1; j < n; j++) 
     rightsum += arr[j]; 

 if (leftsum == rightsum) 
     return i; 
        }
    }
}