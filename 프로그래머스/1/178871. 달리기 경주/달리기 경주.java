import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        HashMap<String,Integer> hs = new HashMap<>();
        
        for(int i=0;i<players.length;i++) {
            hs.put(players[i],i);
        }
        
        for(int i=0;i<callings.length;i++) {
            String front = players[hs.get(callings[i])-1];
            
            players[hs.get(callings[i])-1] = callings[i];
            players[hs.get(callings[i])] = front;
            
            hs.put(front, hs.get(callings[i]));
            hs.put(callings[i], hs.get(callings[i])-1);

        }
        
        answer = players;
        
        return answer;
    }
}