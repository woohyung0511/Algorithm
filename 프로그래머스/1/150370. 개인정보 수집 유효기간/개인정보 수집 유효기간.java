import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> hs = new HashMap<>();

        String[] getToday = today.split("\\.");
        int year = Integer.parseInt(getToday[0]);
        int month = Integer.parseInt(getToday[1]);
        int day = Integer.parseInt(getToday[2]);
        int total = (year * 12 * 28) + (month * 28) + day;

        for (String t : terms) {
            String[] parts = t.split(" ");

            String key = parts[0];
            int value = Integer.parseInt(parts[1]);

            hs.put(key, value);
        }

        int index = 1;

        for (String p : privacies) {
            String[] parts = p.split(" ");

            int value = hs.get(parts[1]);

            String[] getToday2 = parts[0].split("\\.");
            int year2 = Integer.parseInt(getToday2[0]);
            int month2 = Integer.parseInt(getToday2[1]);
            int day2 = Integer.parseInt(getToday2[2]);
            int total2 = (year2 * 12 * 28) + (month2 * 28) +(value * 28)+ day2;

            if (total >= total2) {
                list.add(index);
            }

            index++;
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        

        return answer;
    }
}
