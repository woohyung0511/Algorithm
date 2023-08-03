class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean [] arr =new boolean [n];
        int a=0;
        
        for(int i=0;i<n;i++){
            if(a < section.length && i==section[a]-1){
                arr[i]=false;
                a++;
            }else{
                arr[i]=true;
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]==false){
                for(int j=i;j<Math.min(i+m,n);j++){
                    arr[j]=true;
                }
                answer++;
            }
        }
        
        return answer;
    }
}