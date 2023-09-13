class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean [] visit = new boolean[n];
        
        for(int i=0;i<computers.length;i++){
            if(visit[i]==false){
                dfs(computers,i,visit);
                answer++;
            }
        }
        return answer;
    }
    
    void dfs(int [][] computers,int i,boolean [] visit){
        visit[i]=true;
        
        for(int j=0;j<computers.length;j++){
            if(visit[j]==false && computers[i][j]==1){
                dfs(computers,j,visit);
            }
        }
    }
}