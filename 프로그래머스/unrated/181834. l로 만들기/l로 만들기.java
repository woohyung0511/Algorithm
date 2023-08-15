class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder(); 
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if (ch < 'l') { 
                ch = 'l'; 
            }
            answer.append(ch); 
        }
        return answer.toString(); 
    }
}
