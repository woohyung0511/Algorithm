class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
                myString=myString.replace("A","Y").replace("B","X");
                pat=pat.replace("A","X").replace("B","Y");
        
        
        if(myString.contains(pat)){
            answer=1;
        }
        return answer;
    }
}