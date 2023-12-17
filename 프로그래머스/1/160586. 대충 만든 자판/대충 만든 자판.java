import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> hs = new HashMap<>();

        for (String k : keymap) {
            int num = 1;
            for (char ch : k.toCharArray()) {
                if (!hs.containsKey(ch)) {
                    hs.put(ch, num++);
                } else {
                    hs.put(ch, Math.min(hs.get(ch), num++));
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (char ch : targets[i].toCharArray()) {
                if (hs.containsKey(ch)) {
                    sum += hs.get(ch);
                } else {
                    sum = -1; 
                    break;
                }
            }

            answer[i] = sum;
        }

        return answer;
    }
}
