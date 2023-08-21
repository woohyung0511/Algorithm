class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int max=0;
        
        while(true){
            int max1=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            for(int i=0;i<arr.length;i++){
                    max1+=arr[i];
                }
            if(max==max1){
                break;
            }
            max=max1;
            answer++;
        }
        if(answer==1){
            answer--;
        }
        return answer;
    }
}