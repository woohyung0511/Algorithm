class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        int a=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=arr[j][i]){
                    a++;
                }
            }
        }
        
        if(a==0){
            answer=1;
        }else{
            answer=0;
        }
        
        return answer;
    }
}