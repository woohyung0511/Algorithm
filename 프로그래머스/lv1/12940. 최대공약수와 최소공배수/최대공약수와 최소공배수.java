class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int max=0;
        int min=0;
        
        for(int i=1;i<=m;i++){
            if(n%i==0 && m%i==0){
                max=i;
                answer[0]=max;
            }
        }
        min=(m/max)*(n/max)*max;
        answer[1]=min;
        
        return answer;
    }
}