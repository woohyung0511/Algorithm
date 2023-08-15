import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {2,1,2,3,2,4,2,5};
        int [] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int answer1=0;
        int answer2=0;
        int answer3=0;
        
        for(int i=0;i<answers.length;i++){
            if(arr1[i % arr1.length] == answers[i]){
                answer1++;
            }
        }
        
        for(int i=0;i<answers.length;i++){
            if(arr2[i % arr2.length] == answers[i]){
                answer2++;
            }
        }
        
        for(int i=0;i<answers.length;i++){
            if(arr3[i % arr3.length] == answers[i]){
                answer3++;
            }
        }
        
        answer[0]=answer1;
        answer[1]=answer2;
        answer[2]=answer3;
        
        List<Integer> resultList = new ArrayList<>();
        int maxScore = Math.max(answer1, Math.max(answer2, answer3));
        
        if (answer1 == maxScore) {
            resultList.add(1);
        }
        if (answer2 == maxScore) {
            resultList.add(2);
        }
        if (answer3 == maxScore) {
            resultList.add(3);
        }
        
        answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}
