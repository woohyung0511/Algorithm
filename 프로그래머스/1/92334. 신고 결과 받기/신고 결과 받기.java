import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //1.중복제거
        HashSet<String> reportSet = new HashSet<>();
        
        for(String rep : report) {
            reportSet.add(rep);
        }
        
        //2.<신고당한사람,<신고한사람1,신고한사람2..>> 형태 만들기
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        
        for(String rep : reportSet) {
            String [] reportList = rep.split(" ");
            
            ArrayList<String> list = map.getOrDefault(reportList[1],null);
            
            if(list == null) {
                list = new ArrayList<>();
            }
            
            list.add(reportList[0]);
            
            map.put(reportList[1],list);
        }
        
        //3.List길이가 k이상
        HashMap<String,Integer> repHash = new HashMap<>();
        
        for(ArrayList<String> list : map.values()) {
            if(list.size() >= k) {
                for(String reporter : list) {
                    repHash.put(reporter,repHash.getOrDefault(reporter,0)+1);
                }
            }
        }
        
        //4.출력
        for(int i=0;i<answer.length;i++) {
            answer[i] = repHash.getOrDefault(id_list[i],0);
        }
        return answer;
    }
}