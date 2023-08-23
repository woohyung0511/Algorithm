class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a==b && b==c && c==d)
            answer=1111*a;
        else if(a==b && b==c && c!=d)
            answer=(10*a+d)*(10*a+d);
        else if(a==b && b==d && c!=d)
            answer=(10*a+c)*(10*a+c);
        else if(a==c && c==d && a!=b)
            answer=(10*a+b)*(10*a+b);
        else if(b==c && c==d && a!=b)
            answer=(10*b+a)*(10*b+a);
        else if(a==b && b!=c && c==d)
            answer=(a+c)*Math.abs(a-c);
        else if(a==c && b!=a && b==d)
            answer=(a+b)*Math.abs(a-b);
        else if(a==d && a!=b && b==c)
            answer=(a+b)*Math.abs(a-b);
        else if(a==b && b!=c && b!=d && c!=d)
            answer=c*d;
        else if(a==c && c!=b && c!=d && b!=d)
            answer=b*d;
        else if(a==d && a!=b && a!=c && b!=c)
            answer=b*c;
        else if(b==c && a!=b && d!=b && a!=d)
            answer=a*d;
        else if(b==d && a!=b && c!=b && a!=c)
            answer=a*c;
        else if(c==d && a!=c && b!=c && a!=b)
            answer=a*b;
        else if(a!=b && b!=c && c!=d)
            answer=Math.min(a,Math.min(b,Math.min(c,d)));
        
            
        return answer;
    }
}