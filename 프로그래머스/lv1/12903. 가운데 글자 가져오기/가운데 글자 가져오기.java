class Solution {
    public String solution(String s) {
        String answer = "";
        
        if (s.length() % 2 == 0) {
            int middle = s.length() / 2;
            answer = s.substring(middle - 1, middle + 1);
        } else {
            int middle = s.length() / 2;
            answer = s.substring(middle, middle + 1);
        }
        
        return answer;
    }
}