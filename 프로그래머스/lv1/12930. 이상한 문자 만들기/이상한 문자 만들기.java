class Solution {
    public String solution(String s) {
        String answer = "";
        String [] arr = s.split("");
        
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(" ")){
                a=0;
                answer+=arr[i];
            }else if(a%2==0){
                answer+=arr[i].toUpperCase();
                a++;
            }else{
                answer+=arr[i].toLowerCase();
                a++;
            }
        }
        
        return answer;
    }
}