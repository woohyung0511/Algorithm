
class Solution {
    public int[] solution(int n) {
        int [] answer =new int [(n+1)/2];
        int a=0;
        for(int i=1;i<=n;i+=2){
            answer[a]=i;
            a++;
        }
        return answer;
    }
}