
import java.util.*;
public class Main {
	static int n,m;
	static int [][] maps;
	static boolean [][] visited;
	static int result = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        
        maps = new int [n][m];
        visited= new boolean [n][m];
        
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		maps[i][j] = sc.nextInt();
        	}
        }
        
        int count = 0;
        
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(maps[i][j] == 1 && !visited[i][j]) {
        			bfs(i,j);
        			count++;
        		}
        	}
        }
        
        if(count == 0) {
        	System.out.println(0);
        	System.out.println(0);
        }else {
            System.out.println(count);
            System.out.println(result);
        }
    }
    
    public static void bfs(int x, int y) {
    	
    	Queue <Node> q = new LinkedList<>();
    	
    	int [][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    	
    	q.add(new Node(x,y));
    	
    	visited[x][y] = true;
    	
    	int count = 1;
    	
    	while(!q.isEmpty()) {
    		
    		result = Math.max(result, count);
    				
    		Node node = q.poll();
    		
    		int currentX = node.x;
    		int currentY = node.y;
    		
    		for(int [] direction : directions) {
    			int newX = currentX + direction[0];
    			int newY = currentY + direction[1];
    			
    			if(newX >= 0 && newX <= n-1 && newY >= 0 && newY <= m-1 && !visited[newX][newY] && maps[newX][newY] == 1) {
    				visited[newX][newY] = true;
    				q.add(new Node(newX, newY));
    				count++;
    			}
    		}
    	}
    }
    
    static class Node {
    	int x;
    	int y;
    	
    	Node(int x, int y) {
    		this.x = x;
    		this.y = y;
    	}
    }
}
