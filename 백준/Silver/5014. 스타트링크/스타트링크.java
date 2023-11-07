import java.util.*;

public class Main {
	static int F,S,G,U,D,count;
	static int [] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        F = sc.nextInt();
        S = sc.nextInt();
        G = sc.nextInt();
        U = sc.nextInt();
        D = sc.nextInt();
     
        arr = new int [F+1];
        
        for(int i=0;i<F+1;i++) {
        	arr[i] = -1;
        }
        
        arr[S] = 0;
        
        bfs();
    }
    
    public static void bfs() {
    	
    	Queue <Integer> q = new LinkedList<>();
    	q.add(S);
    	
    	while(!q.isEmpty()) {
    		
    		S = q.poll();
    		
    		if(S+U<=F && arr[S+U] == -1) {
    			count++;
    			q.add(S+U);
    			arr[S+U] = arr[S]+1;
    		}
    		
    		if(S-D>=1 && arr[S-D] == -1) {
    			count++;
    			q.add(S-D);
    			arr[S-D] = arr[S]+1;
    		}
    	}
    	
    	if(arr[G] == -1) {
    		System.out.println("use the stairs");
    	}else {
    		System.out.println(arr[G]);
    	}
    }
}
