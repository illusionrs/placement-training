import java.util.*;

class MirrorInverse{

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        int arr[] = { 1, 2, 3, 0 };

        if(Sol(arr)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static boolean Sol(int[] arr){

        for(int i=0;i<arr.length;i++){

            if(arr[arr[i]]!=i)
            return false;
        }
        return true;
    }
}