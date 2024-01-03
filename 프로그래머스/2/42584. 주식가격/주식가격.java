import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int p : prices) {
            que.add(p);
        }
        
        int index = 0;
        
        while(!que.isEmpty()) {
            int count = 0;
            int top = que.poll();
            
            for(int q : que) {
                count++;
                if(top > q) {
                    break;
                }
            }
            
            answer[index++] = count;
        }
        return answer;
    }
}