import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        List <Integer> list = new ArrayList<>();
        
        String [][] arr = new String [wallpaper.length][wallpaper[0].length()];
        
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        
        for(int i=0;i<wallpaper.length;i++) {
            for(int j=0;j<wallpaper[i].length();j++) {
                arr[i][j] = wallpaper[i].substring(j,j+1);
            }
        }
        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j].equals("#")) {
                    maxX = Math.max(maxX,i);
                    maxY = Math.max(maxY,j);
                    minX = Math.min(minX,i);
                    minY = Math.min(minY,j);
                }
            }
        }
        
        list.add(minX);
        list.add(minY);
        list.add(maxX+1);
        list.add(maxY+1);

        int [] answer = new int [4];
        
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}