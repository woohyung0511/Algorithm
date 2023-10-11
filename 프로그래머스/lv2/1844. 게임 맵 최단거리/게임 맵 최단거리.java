import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        
        int m = maps.length;
        int n = maps[0].length;
        
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(new Node(0,0,1));
        
        while(!queue.isEmpty()){
            Node node = queue.poll();
            
            int x = node.x;
            int y = node.y;
            int distance = node.distance;
            
            if(x == m-1 && y == n-1){
                return distance;
            }
            
            for(int [] direction : directions){
                int newX = x + direction[0];
                int newY = y + direction[1];
                
                if(newX>=0 && newX<m && newY>=0 && newY<n && maps[newX][newY]==1){
                    queue.add(new Node(newX,newY,distance+1));
                    maps[newX][newY]=0;
                }
            }
            
        }
        return -1;
    }
    
    class Node{
        int x;
        int y;
        int distance;
        
        public Node(int x,int y,int distance){
            this.x=x;
            this.y=y;
            this.distance=distance;
        }
    }
}