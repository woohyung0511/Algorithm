import java.util.*;

public class Main {
	static int w,h;
	static int [][] area;
	static boolean [][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            w = sc.nextInt();
            h = sc.nextInt();
            
            if(w == 0 && h == 0) {
            	break;
            }
            
            area = new int[h][w];
            visited = new boolean [h][w];
            
        	for(int i=0;i<h;i++) {
            	for(int j=0;j<w;j++) {
            		area[i][j] = sc.nextInt();
            	}
            }
            
            int count = 0;
            
            for(int i=0;i<h;i++) {
            	for(int j=0;j<w;j++) {
            		if(!visited[i][j] && area[i][j] == 1) {
            			count++;
            			dfs(i,j);
            		}
            	}
            }
            
            System.out.println(count);
        }
    }
    
    static public void dfs(int i, int j) {
    	int [][] directions = {{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
    	
    	visited[i][j] = true;
    	
    	for(int [] direction : directions) {
    		int newI = i + direction[0];
    		int newJ = j + direction[1];
    		
    		if (newI >= 0 && newI <= h-1 && newJ >= 0 && newJ <= w-1 && !visited[newI][newJ] && area[newI][newJ] == 1) {
                dfs(newI, newJ);
            }
    	}
    }
}
