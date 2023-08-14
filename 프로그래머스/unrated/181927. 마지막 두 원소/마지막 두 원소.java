import java.util.*;

class Solution {
    public List solution(int[] num_list) {
        List <Integer> list = new ArrayList<>();
        
        for(int i=0;i<num_list.length;i++){
            list.add(num_list[i]);
        }
        
             if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
            list.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            list.add(num_list[num_list.length - 1] * 2);
        }
        
        
        return list;
    }
}