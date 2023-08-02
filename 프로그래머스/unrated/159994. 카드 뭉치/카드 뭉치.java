class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int a=0;
        int b=0;
        
        for(int i=0;i<goal.length;i++){
            if(cards1.length>a && goal[i].equals(cards1[a])){
                a++;
            }else if(cards2.length>b && goal[i].equals(cards2[b])){
                b++;
            }else{
                return "No";
            }
            
        }
        
        return "Yes";
        
        
    }
}