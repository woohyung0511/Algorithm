class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String num="";
        int [] arr = new int [3];
        int a=0;
        
        for(int i=0;i<dartResult.length();i++){
            char ch = dartResult.charAt(i);
            
            if(String.valueOf(ch).matches("[0-9]")){
                num+=ch;
            }else if(String.valueOf(ch).equals("S")){
                int n=Integer.valueOf(num);
                arr[a]=(int)Math.pow(n,1);
                a++;
                num="";
            }else if(String.valueOf(ch).equals("D")){
                int n=Integer.valueOf(num);
                arr[a]=(int)Math.pow(n,2);
                a++;
                num="";
            }else if(String.valueOf(ch).equals("T")){
                int n=Integer.valueOf(num);
                arr[a]=(int)Math.pow(n,3);
                a++;
                num="";
            }else if(String.valueOf(ch).equals("*")){
                if(a>1){
                    arr[a-1]*=2;
                    arr[a-2]*=2;
                }else{
                    arr[a-1]*=2;
                }
            }else if(String.valueOf(ch).equals("#")){
                arr[a-1]*=-1;
            }
        }
        
        answer=arr[0]+arr[1]+arr[2];
        
        return answer;
    }
}