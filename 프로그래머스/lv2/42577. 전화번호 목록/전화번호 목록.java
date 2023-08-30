import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap <String,Integer> map = new HashMap<>();
        
        for(String phone:phone_book){
            map.put(phone,1);
        }
        
        for(int i=0;i<phone_book.length;i++){
            for(int j=1;j<phone_book[i].length();j++){
                String phone = phone_book[i].substring(0,j);
                if(map.containsKey(phone)){
                    answer=false;
                    return answer;
                }
            }
        }
        return answer;
    }
}