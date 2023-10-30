

import java.util.*;

public class Main {
	static int M,N,K;
	static int [][] maps;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();
        
        maps = new int [N][M];
        
        for(int i=0;i<K;i++) {
        	int x1 = sc.nextInt(); 
        	int y1 = sc.nextInt(); 
        	int x2 = sc.nextInt(); 
        	int y2 = sc.nextInt(); 
        	
        	for(int x = x1;x<x2;x++) {
        		for(int y = y1;y<y2;y++) {
        			maps[x][y] = 1;
        		}
        	}
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int count = 0;
        
        for(int i=0;i<N;i++) {
        	for(int j=0;j<M;j++) {
        		if(maps[i][j] == 0) {
        			count++;
        			int result = dfs(i,j);
        			list.add(result);
        		}
        	}
        }
        
        System.out.println(count);
        Collections.sort(list);
        
        for(int area : list) {
        	System.out.print(area+" ");
        }
    }
    
    public static int dfs(int x,int y) {
    	
    	maps[x][y] = 1;
    	
    	int count = 1;
    	
    	int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    	
    	for(int [] direction : directions) {
    		int newX = x + direction[0];
    		int newY = y + direction[1];
    		
    		if(newX >= 0 && newX <= N-1 && newY >= 0 && newY <= M-1 && maps[newX][newY] == 0) {
    			count += dfs(newX, newY);
    		}
    	}
    	
    	return count;
    }
}
