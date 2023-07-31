class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max=0;
        int min=Math.min(sizes[0][0],sizes[0][1]);
        
        for(int[] size: sizes){
           int max2=Math.max(size[0],size[1]);
           int min2=Math.min(size[0],size[1]);
            
            if(max2>max){
                max=max2;
            }
            if(min2>min){
                min=min2;
            }
        }
        answer=max*min;
        return answer;
    }
}