class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            int a = n % 3;
            sb.append(a);
            n /= 3;
        }
        
        return Integer.parseInt(sb.toString(),3);
    }
}