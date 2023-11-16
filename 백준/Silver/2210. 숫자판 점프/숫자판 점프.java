
import java.util.*;
public class Main {
	static int [][] maps;
	static HashSet<Integer> hs;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        maps = new int [5][5];
        hs = new HashSet<>();

        for(int i=0;i<5;i++) {
        	for(int j=0;j<5;j++) {
        		maps[i][j] = sc.nextInt();
        	}
        }
        
        for(int i=0;i<5;i++) {
        	for(int j=0;j<5;j++) {
        		dfs(i,j,0,0);
        	}
        }
        
        System.out.println(hs.size());
    }
    
    public static void dfs(int x, int y, int num, int depth) {
    	
    	if(depth == 6) {
    		hs.add(num);
    		return;
    	}
    	
    	int [][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    	
    	int digit = maps[x][y];
    	
    	num = num * 10 + digit;
    	
    	for(int [] direction : directions) {
    		int newX = x + direction[0];
    		int newY = y + direction[1];
    		
    		if(newX >= 0 && newX <= 4 && newY >= 0 && newY <= 4) {
    			dfs(newX, newY, num , depth+1);
    		}
    	}
    }
}
