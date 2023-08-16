import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        String [] arr =myString.split("x");
        
        List <Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            list.add(arr[i].length());
        }
        
        if(myString.charAt(myString.length()-1)=='x'){
            list.add(0);
        }
        
        int [] answer = new int [list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        
        return answer;
    }
}