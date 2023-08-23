class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        for(int i=0;i<code.length();i++){
            char ch = code.charAt(i);
            
            if(mode==false && ch!='1' && i%2==0){
                answer+=ch;
            }else if(ch=='1'){
                mode=!mode;
            }else if(ch!='1' && mode && i%2==1){
                answer+=ch;
            }
        }
        
        if(answer.equals("")){
            answer="EMPTY";
        }
        
        
        return answer;
    }
}