class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<food.length;i++){
            int a=food[i]/2;
            for(int j=0;j<a;j++){
                sb.append(i);
            }
        }
        
        sb.append(0);
        
        for(int i=food.length-1;i>=1;i--){
            int b=food[i]/2;
            for(int j=0;j<b;j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}