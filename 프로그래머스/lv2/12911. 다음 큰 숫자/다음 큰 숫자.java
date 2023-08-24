class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt=0;
        int b=0;
        
        String a=Integer.toBinaryString(n);
        
        for(int i=0;i<a.length();i++){
                char ch = a.charAt(i);
                if(ch=='1'){
                    cnt++;
                }
            }
        
        while(true){
            b= n+=1;
            int cnt2=0;
            String c=Integer.toBinaryString(b);
            
            for(int i=0;i<c.length();i++){
                char ch2 = c.charAt(i);
                if(ch2=='1'){
                    cnt2++;
                }
            }
            if(cnt==cnt2){
                break;
            }
        }
        return b;
    }
}