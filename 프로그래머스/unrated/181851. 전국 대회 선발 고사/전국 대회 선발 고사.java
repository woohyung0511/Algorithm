import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        
        List <Integer> list = new ArrayList<>();
        
        for(int i=0;i<3;i++){
            int min=Integer.MAX_VALUE;
            int a=0;
            for(int j=0;j<rank.length;j++){
                if(rank[j]<min && attendance[j]==true){
                    min=rank[j];
                    a=j;  
                }
                
            }
            list.add(a);
            attendance[a]=false;
            
        }
        
        answer=10000 * list.get(0) + 100 * list.get(1) + list.get(2);
        
        return answer;
    }
}