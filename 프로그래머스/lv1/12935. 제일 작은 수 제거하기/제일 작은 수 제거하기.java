class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length-1];
        int min=arr[0];
        
        if(arr.length==1){
            return new int []{-1};
        }else{
            for(int i=0;i<arr.length;i++){
                if(min>arr[i]){
                    min=arr[i];
                }
            }
            int count=0;
            
            for(int i=0;i<arr.length;i++){
                if(min!=arr[i]){
                    answer[count]=arr[i];
                        count++;
                }else{
                    continue;
                }
            }
        }
        return answer;
    }
}