import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    
                    boolean a =true;
                    
                    if(sum==2){
                        a=true;
                    }
                    
                    for(int t=2;t<sum;t++){
                        if(sum%t==0){
                            a=false;
                        }
                    }
                    
                    if(a){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}