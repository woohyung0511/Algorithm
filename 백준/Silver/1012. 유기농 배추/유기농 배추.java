import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc =new Scanner(System.in);
    	
    	int T = sc.nextInt();
    	
    	
    	for(int i=0;i<T;i++) {
    		int width = sc.nextInt();
    		int height = sc.nextInt();
    		int count = sc.nextInt();
    		int [][] square = new int [width][height];
    		
    		for(int j=0;j<count;j++) {
    			square[sc.nextInt()][sc.nextInt()] = 1;
    		}
    		
    		int bug = 0;
    		
    		for(int m=0;m<width;m++) {
    			for(int n=0;n<height;n++) {
    				if(square[m][n] == 1) {
    					dfs(square,m,n);
    					bug++;
    				}
    			}
    		}
    		System.out.println(bug);
    	}
    }
    
    public static void dfs(int [][] square, int m, int n) {
    	
    	int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    	
    	int M =square.length;
    	int N =square[0].length;
    	
    	for(int [] direction : directions) {
    		int newX = m + direction[0];
    		int newY = n + direction[1];
    		
    		if(newX >= 0 && newX < M && newY >= 0 && newY < N && square[newX][newY] == 1) {
    			square[newX][newY] = 0;
    			dfs(square,newX,newY);
    		}
    	}
    }    
}