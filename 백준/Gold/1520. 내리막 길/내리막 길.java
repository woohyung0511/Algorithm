
import java.util.*;
public class Main {
	static int M,N;
	static int [][] maps,dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        M = sc.nextInt();
        N = sc.nextInt();
        
        maps = new int [M][N];
        dp = new int [M][N];
        
        for(int i=0;i<M;i++) {
        	for(int j=0;j<N;j++) {
        		maps[i][j] = sc.nextInt();
        		dp[i][j] = -1;
        	}
        }
        
        int result = dfs(0,0);
        
        System.out.println(result);
    }
    
    public static int dfs(int x, int y) {
    	
    	int [][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    	
    	if (x == M - 1 && y == N - 1) {
    	    return 1;
    	}
    	
    	if(dp[x][y] != -1) {
    		return dp[x][y];
    	}
    	
    	int count = 0;
    	
    	for(int [] direction : directions) {
    		int newX = x + direction[0];
    		int newY = y + direction[1];
    		
    		if(newX >= 0 && newX <= M-1 && newY >= 0 && newY <= N-1 && maps[x][y] > maps[newX][newY]) {
    			count+=dfs(newX,newY);    			
    		}    		
    	}
    	
    	dp[x][y] = count;
    	
    	return count;
    }
}
