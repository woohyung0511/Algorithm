import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Stack <Integer> st = new Stack<>();
        
        for(int a:arr){
            st.push(a);
            if(st.size()>=2){
                if(st.get(st.size()-2)==st.get(st.size()-1)){
                    st.pop();
                }
            }
        }
        
        int [] answer = new int [st.size()];
        
        for(int i=st.size()-1;i>=0;i--){
            answer[i]=st.pop();
        }

        
        return answer;
    }
}