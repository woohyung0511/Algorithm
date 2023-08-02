import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max=nums.length/2;
        
        HashSet<Integer> numset = new HashSet<>();
        
        for(int num:nums){
            numset.add(num);
        }
        
        if(numset.size()>max){
            return max;
        }else{
            return numset.size();
        }

    }
}