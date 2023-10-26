
import java.util.*;

public class Main {
	static int num,size,startX,startY,desX,desY;
	static int [][] board;
	static boolean [][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] directions = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
        
        num = sc.nextInt();
        
        for(int i=0;i<num;i++) {
        	size = sc.nextInt();       	
        	startX = sc.nextInt();
        	startY = sc.nextInt();
        	desX = sc.nextInt();
        	desY = sc.nextInt();
        	
        	board = new int [size][size];
        	visited = new boolean [size][size];
        	
        	Queue <Node> queue = new LinkedList<>();
        	
        	queue.add(new Node(startX,startY,0));
        	
        	while(!queue.isEmpty()) {
        		
        		Node node = queue.poll();
        		
        		int x = node.x;
        		int y = node.y;
        		int count = node.count;
        		
        		if(x == desX && y == desY) {
        			System.out.println(count);
        			break;
        		}
        		
        		for(int [] direction : directions) {
        			int newX = x + direction[0];
        			int newY = y + direction[1];
        			
        			if(newX >= 0 && newX <= size-1 &&  newY >= 0 && newY <= size-1 && !visited[newX][newY]) {
        				visited[newX][newY] = true;
        				queue.add(new Node(newX,newY,count+1));
        			}
        		}   		
        	}
        }
        
    }
    
    static class Node {
    	int x;
    	int y;
    	int count;
    	Node(int x,int y, int count) {
    		this.x = x;
    		this.y = y;
    		this.count = count;
    	}
    }
}
