class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int cnt=0;
        int zcnt=0;
        
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                    zcnt++;
                }
            for(int j=0;j<win_nums.length;j++){
                 if(lottos[i]==win_nums[j]){
                    cnt++;
                }
            }
            answer[0]=Math.min(7-(zcnt+cnt),6);
            answer[1]=Math.min(7-cnt,6);
        }
        return answer;
    }
}