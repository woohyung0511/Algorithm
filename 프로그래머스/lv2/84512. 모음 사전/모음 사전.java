import java.util.*;

class Solution {
    static String [] arr = {"A","E","I","O","U"};
    static List <String> list = new ArrayList<>();
    
    public int solution(String word) {
        int answer = 0;
        String str = "";
        
        recursion("",0);
        
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(word)){
                answer=i;
                break;
            }
        }
        
        return answer;
    }
    
    public void recursion(String str,int depth){
            
            list.add(str);
            
            if(depth==5){
                return;
            }
            
            for(int i=0;i<arr.length;i++){
                recursion(str+arr[i],depth+1);
            }
        }
}