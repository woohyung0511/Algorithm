class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String [] arr = my_string.split("");
        
        for(int i=c-1;i<arr.length;i+=m){
            answer+=arr[i];
        }
        return answer;
    }
}