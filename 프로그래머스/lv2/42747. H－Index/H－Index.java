class Solution {
    public int solution(int[] citations) {
        int answer = 1;
        
        while(true){
            int cnt = 0;
            for(int i=0;i<citations.length;i++){
                if(answer<=citations[i]){
                    cnt++;
                }
            }
            
            if(answer<=cnt && citations.length-cnt<=answer){
                answer++;
            }else{
                break;
            }
        }
        return answer-1;
    }
}