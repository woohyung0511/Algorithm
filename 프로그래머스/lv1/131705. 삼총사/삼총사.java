class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int cnt1=1;
        int cnt2=2;
        
        for(int i=0;i<number.length;i++){
            for(int j=cnt1;j<number.length;j++){
                for(int k=cnt2;k<number.length;k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                }
                cnt2++;
            }
            cnt1++;
            cnt2=cnt1+1;
        }
        return answer;
    }
}