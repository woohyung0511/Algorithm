class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        boolean a = true;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch ==' '){
                sb.append(ch);
                a=true;
            }else if(a){
                sb.append(Character.toUpperCase(ch));
                a=false;
            }else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
}