import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List <Integer> list = new ArrayList<>();
        int a=0;
        int b=0;
        int c=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                a=i;
                c++;
                break;
            }
        }
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==2){
                b=i;
                c++;
                break;
            }
        }
        
        if(c==0){
            list.add(-1);
        }else{
            for(int i=a;i<=b;i++){
                list.add(arr[i]);
            }
        }
        
        int [] answer = new int [list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}