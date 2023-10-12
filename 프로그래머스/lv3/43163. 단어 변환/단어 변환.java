import java.util.*;

class Solution {
    int answer = 9999;
    
    public int solution(String begin, String target, String[] words) {
        
        boolean [] visited = new boolean[words.length];
        
        if(!Arrays.asList(words).contains(target)){
            return 0;
        }
        
        dfs(visited,begin,target,words,0);
        
        return (answer == 9999) ? 9999 : answer;
    }
    
    public void dfs(boolean [] visited,String begin,String target,String [] words,int depth){
        if(begin.equals(target)){
            answer = Math.min(answer,depth);
            return;
        }
        
        for(int i=0;i<words.length;i++){
            if(!visited[i] && difference(words[i],begin)){
                visited[i]=true;
                dfs(visited,words[i],target,words,depth+1);
                visited[i]=false;
            }
        }
    }
    
    public boolean difference(String word,String target){
        int differ = 0;
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=target.charAt(i)){
                differ++;
            }
        }
        
        return differ == 1;
    }
}