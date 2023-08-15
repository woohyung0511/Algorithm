import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List <String> list = new ArrayList<>();
        String[] arr = my_string.split(" ");
        
        for(int i=0;i<arr.length;i++){
            if(!arr[i].isEmpty()){
                list.add(arr[i]);
            }
        }
        
        
        return list.toArray(new String[list.size()]);
    }
}