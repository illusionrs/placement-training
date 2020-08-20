import java.util.*;

class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        
        Map<Integer,Integer> hasmap=new HashMap<Integer,Integer>();
        
        
        for(int i=0;i<n;i++){
            
            int dif=target-nums[i];
            
        if(hasmap.containsKey(dif)){
            return new int[]{hasmap.get(dif),i};
        }
            hasmap.put(nums[i],i);
        }
        
        
        return new int[0];
        
        
    }
}