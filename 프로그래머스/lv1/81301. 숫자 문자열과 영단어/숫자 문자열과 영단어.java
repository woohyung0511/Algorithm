import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }else{
                sb2.append(c);
                if(map.containsKey(sb2.toString())){
                    sb.append(map.get(sb2.toString()));
                    sb2.setLength(0);
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}