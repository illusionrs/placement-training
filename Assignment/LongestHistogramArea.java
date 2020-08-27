import java.util.*;


class LongestHistogramArea{

    public static void main(String[] args){
      int[] arr=new int[]{2,1,5,6,2,3};

      System.out.println(Sol(arr));
    }

    public static int Sol(int[] height){
        int res=0,idx=0;

        Stack<Integer> s=new Stack<>();

        while(idx<=height.length){

            if(idx< height.length && (s.empty() || height[idx]>=height[s.peek()]))
                s.push(idx++);
            else{

                if(s.empty() && idx==height.length)
                    break;
                int t = s.pop();
                res = Math.max(res, height[t] * (s.isEmpty() ? idx : idx - s.peek() - 1));
            }

        }

        return res;
    }


}