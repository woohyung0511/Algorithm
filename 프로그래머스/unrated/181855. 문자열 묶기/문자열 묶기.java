import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int [] arr = new int [strArr.length];
        
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<strArr.length;i++){
            arr[i]=strArr[i].length();
        }
        
        for(int i=0;i<strArr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int v:map.values()){
            answer=Math.max(answer,v);
        }
        
        return answer;
    }
}