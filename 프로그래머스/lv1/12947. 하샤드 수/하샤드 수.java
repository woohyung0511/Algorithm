class Solution {
    public boolean solution(int x) {
        boolean answer=true;
        int sum=0;
        
        String tmp[]=String.valueOf(x).split("");
        
        for(int i=0;i<tmp.length;i++){
            int a=Integer.parseInt(tmp[i]);
            sum+=a;
        }
        return x%sum==0;
    }
}