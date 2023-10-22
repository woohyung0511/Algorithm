
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int M = sc.nextInt();
    	int N = sc.nextInt();
    	
    	int [][] graph = new int[1001][1001];
    	boolean [] visited = new boolean[1001];
    	int a,b;
    	for(int i=0;i<N;i++) {
    		a = sc.nextInt();
    		b = sc.nextInt();
    		
    		graph[a][b] = graph[b][a] = 1;
    	}
    	
    	int count = 0;
    	
    	for(int i=1;i<=M;i++) {
    		if(visited[i] == false) {
    			dfs(i,visited, graph,M);
    			count++;
    		}
    	}
    	
    	System.out.println(count);
    }
    
    public static void dfs(int current, boolean [] visited, int [][] graph, int M) {
    	if(visited[current] == true) {
    		return;
    	}else {
    		visited[current] = true;
    		for(int i=1;i<=M;i++) {
    			if(graph[current][i] == 1) {
    				dfs(i,visited,graph,M);
    			}
    		}
    	}
    }
}