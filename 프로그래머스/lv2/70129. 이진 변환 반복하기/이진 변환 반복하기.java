class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        StringBuilder sb = new StringBuilder();
        int ans=0;
        int cnt=0;
        
        while(!s.equals("1")){
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='1'){
                    sb.append(ch);
                }else{
                    ans++;
                }
            }
            s=Integer.toBinaryString(sb.length());
            sb.setLength(0);
            cnt++;
        }
        
        answer[0]=cnt;
        answer[1]=ans;
        
        return answer;
    }
}