import java.util.*;

class Solution {
    public List solution(int n) {
         List<Integer> answerList = new ArrayList<>();
        
        for (int i = 1; i <= n; i += 2) {
            answerList.add(i);
        }
        return answerList;
    }
}