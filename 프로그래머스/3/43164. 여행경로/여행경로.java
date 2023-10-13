import java.util.*;

class Solution {
    public String[] solution(String[][] tickets) {
        
        ArrayList<String> list = new ArrayList<>();
        
        boolean [] visited = new boolean[tickets.length];
        
        String[] answer = {};
        
        dfs("ICN","ICN",visited,0,list,tickets);
        
        Collections.sort(list);
        
        answer = list.get(0).split(" ");
        
        return answer;
    }
    
    public void dfs(String start,String current,boolean [] visited,int depth,ArrayList<String> list,String [][] tickets){
        if(depth==tickets.length){
            list.add(current);
            return;
        }
        
        for(int i=0;i<tickets.length;i++){
            if(!visited[i] && start.equals(tickets[i][0])){
                visited[i]=true;
                dfs(tickets[i][1],current+" "+tickets[i][1],visited,depth+1,list,tickets);
                visited[i]=false;
            }
        }
    }
}