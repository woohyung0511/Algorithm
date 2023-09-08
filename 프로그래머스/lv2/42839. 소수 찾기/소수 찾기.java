import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        HashSet <Integer> hs = new HashSet<>();
        
        char [] arr =numbers.toCharArray();
        
        for(int i=1;i<=arr.length;i++){
            boolean [] visited = new boolean[arr.length];
            permute(arr,visited,0,i,"",hs);
        }
        
        for (int num : hs) {
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public void permute(char [] arr,boolean [] visited,int depth,int r,String current,HashSet<Integer> hs){
        if(depth==r){
                int n = Integer.valueOf(current);
                hs.add(n);
                return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                visited[i]=true;
                permute(arr,visited,depth+1,r,current+arr[i],hs);
                visited[i]=false;
            }
        }
    }
    
    public boolean isPrime(int num){
        
        if(num==1 || num ==0)
            return false;
        
        int lim = (int)Math.sqrt(num);
        
        for(int i=2;i<=lim;i++){
            if(num%i==0){
                return false;
            }
        }
        
        return true;
    }
}