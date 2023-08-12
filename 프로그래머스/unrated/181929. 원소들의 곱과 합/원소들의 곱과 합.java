class Solution {
    public int solution(int[] num_list) {
        int answer1 = 1;
        int answer= 0;
        for(int n: num_list){
            answer+=n;
            answer1*=n;
        }
        answer=(answer1<Math.pow(answer,2)?1:0);
        return answer;
    }
}