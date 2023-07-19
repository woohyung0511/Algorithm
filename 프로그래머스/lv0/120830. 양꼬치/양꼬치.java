class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int a=n/10;
        
        answer=n*12000+(k-a)*2000;
        return answer;
    }
}