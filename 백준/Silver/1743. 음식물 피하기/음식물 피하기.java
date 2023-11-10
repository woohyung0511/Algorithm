import java.util.*;

public class Main {
	static int N,M,K,result;
	static int [][] maps;
	static boolean [][] visited;
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	
    	N = sc.nextInt();
    	M = sc.nextInt();
    	K = sc.nextInt();
    	result = Integer.MIN_VALUE;
    	
    	maps = new int [N][M];
    	visited = new boolean[N][M];
    	
    	for(int i=0;i<K;i++) {
    		maps[sc.nextInt()-1][sc.nextInt()-1] = 1;
    	}
    	
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<M;j++) {
    			if(maps[i][j] == 1) {
    				bfs(i,j);
    			}
    		}
    	}
    	
    	System.out.println(result);
    }
    
    public static void bfs(int x, int y) {
    	
    	Queue <Node> q = new LinkedList<>();
    	
    	int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    	
    	visited[x][y] = true;
    	
    	int count = 1;
    	
    	q.add(new Node(x,y));
    	
    	while(!q.isEmpty()) {
    		
    		Node node = q.poll();
    		
    		int currentX = node.x;
    		int currentY = node.y;
    		
    		for(int [] direction : directions) {
    			
    			int newX = currentX + direction[0];
    			int newY = currentY + direction[1];
    			
    			if(newX >= 0 && newX <= N-1 && newY >= 0 && newY <= M-1 && !visited[newX][newY] && maps[newX][newY] == 1) {
    				visited[newX][newY] = true;
    				q.add(new Node(newX,newY));
    				count++;
    			}
    		}
    	}
    	
    	result = Math.max(result, count);
    }
    
    static class Node {
    	int x;
    	int y;
    	
    	Node(int x, int y){
    		this.x = x;
    		this.y = y;
    	}
    }
}
