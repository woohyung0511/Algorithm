class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        String[] arr1 = new String[str1.length() - 1];
        String[] arr2 = new String[str2.length() - 1];

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str1.length() - 1; i++) {
            String split = str1.substring(i, i + 2);

            char first = split.charAt(0);
            char second = split.charAt(1);

            if (Character.isAlphabetic(first) && Character.isAlphabetic(second)) {
                arr1[count1++] = split;
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String split = str2.substring(i, i + 2);

            char first = split.charAt(0);
            char second = split.charAt(1);

            if (Character.isAlphabetic(first) && Character.isAlphabetic(second)) {
                arr2[count2++] = split;
            }
        }

        int answer1 = 0;
        int answer2 = count1;

        for (int i = 0; i < count1; i++) {
            for (int j = 0; j < count2; j++) {
                if (arr1[i].equals(arr2[j])) {
                    answer1++;
                    arr2[j] = null;  
                    break;
                }
            }
        }

        for (int j = 0; j < count2; j++) {
            if (arr2[j] != null) {
                answer2++;
            }
        }

        if (answer1 == 0 && answer2 == 0) {
            return 65536;
        }

        answer = (int) (((double) answer1 / answer2) * 65536);

        return answer;
    }
}
