class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number + 1];
        
        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    cnt++;
                } else if(i%j==0){
                    cnt += 2;
                }
            }
            if (cnt > limit) {
                arr[i] = power;
            } else {
                arr[i] = cnt;
            }
        }
        
        for (int i = 1; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}
