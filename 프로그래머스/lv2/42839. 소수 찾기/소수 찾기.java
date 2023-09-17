import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        char [] ch = numbers.toCharArray();
        
        boolean [] visit = new boolean[ch.length];
        
        HashSet <Integer> hs = new HashSet<>();
        
        for(int i=0;i<=ch.length;i++){
            dfs(ch,i,0,"",visit,hs);
        }
        
        for(int h: hs){
            if(isPrime(h)){
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(char [] ch,int r,int depth,String str,boolean [] visit,HashSet <Integer> hs){
        if(r==depth){
            if (!str.isEmpty()) {
                hs.add(Integer.valueOf(str));
            }
            return;
        }
        
        for(int i=0;i<ch.length;i++){
            if(visit[i]==false){
                visit[i]=true;
                dfs(ch,r,depth+1,str+ch[i],visit,hs);
                visit[i]=false;
            }
        }
    }
    
    public boolean isPrime(int num){
            if(num==1 || num==0){
                return false;
            }else{
                for(int i=2;i<=Math.sqrt(num);i++){
                    if(num%i==0){
                        return false;
                    }
                }
            }
        return true;
        }
    }