class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (String num : arr) {
            int currentNum = Integer.parseInt(num);
            sum += currentNum;
            if (currentNum > max) {
                max = currentNum;
            }
            if (currentNum < min) {
                min = currentNum;
            }
        }
        
        return min + " " + max;
    }
}




