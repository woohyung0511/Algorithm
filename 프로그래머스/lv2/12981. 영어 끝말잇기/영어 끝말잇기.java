import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> usedWords = new HashSet<>();
        
        usedWords.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            char lastChar = words[i-1].charAt(words[i-1].length() - 1);
            if (lastChar != firstChar || usedWords.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            
            usedWords.add(words[i]);
            
        }

        return answer;
    }
}
