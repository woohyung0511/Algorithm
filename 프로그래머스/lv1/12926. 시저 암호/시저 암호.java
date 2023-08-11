class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                answer+=s.charAt(i);
                continue;
            }
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                if(s.charAt(i)+n<='z'){
                    answer+=(char)(s.charAt(i)+n);
                }else{
                    answer+=(char)(s.charAt(i)-26+n);
                }
            }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                if(s.charAt(i)+n<='Z'){
                    answer+=(char)(s.charAt(i)+n);
                }else{
                    answer+=(char)(s.charAt(i)-26+n);
                }
            }
        }
        return answer;
    }
}