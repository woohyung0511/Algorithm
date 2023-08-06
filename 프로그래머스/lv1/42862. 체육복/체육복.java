class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] arr = new int[n + 1]; // 배열의 크기를 n + 1로 수정
        
        for (int i = 1; i <= n; i++) {
            arr[i] = 1;
        }
        
        for (int l : lost) {
            arr[l] = 0;
        }
        
        for (int r : reserve) {
            arr[r]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                if (arr[i - 1] == 2) {
                    arr[i]++;
                    arr[i - 1]--;
                } else if (i + 1 <= n && arr[i + 1] == 2) {
                    arr[i]++;
                    arr[i + 1]--;
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (arr[i] != 0)
                answer++;
        }
        return answer;
    }
}
