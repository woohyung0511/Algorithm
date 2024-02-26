class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        String[][] map = new String[park.length][park[0].length()];
        
        for (int i = 0; i < park.length; i++) {
            String[] split = park[i].split("");
            for (int j = 0; j < park[i].length(); j++) {
                map[i][j] = split[j];
            }
        }
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals("S")) {
                    command(i, j, map, routes, answer);
                }
            }
        }
        return answer;
    }
    
    private void command(int x, int y, String[][] map, String[] routes, int[] answer) {
        
        for (int i = 0; i < routes.length; i++) {
            String[] split = routes[i].split(" ");
            
            boolean move = true; // 이동 가능한지 여부
            
            if (split[0].equals("E") && y + Integer.parseInt(split[1]) < map[0].length) {
                for (int k = 1; k <= Integer.parseInt(split[1]); k++) {
                    if (map[x][y + k].equals("X")) {
                        move = false; // X를 만나면 이동하지 않음
                        break;
                    }
                }
                if (move) y = y + Integer.parseInt(split[1]); // 이동 가능한 경우에만 이동
            } else if (split[0].equals("W") && y - Integer.parseInt(split[1]) >= 0) {
                for (int k = 1; k <= Integer.parseInt(split[1]); k++) {
                    if (map[x][y - k].equals("X")) {
                        move = false;
                        break;
                    }
                }
                if (move) y = y - Integer.parseInt(split[1]);
            } else if (split[0].equals("S") && x + Integer.parseInt(split[1]) < map.length) {
                for (int k = 1; k <= Integer.parseInt(split[1]); k++) {
                    if (map[x + k][y].equals("X")) {
                        move = false;
                        break;
                    }
                }
                if (move) x = x + Integer.parseInt(split[1]);
            } else if (split[0].equals("N") && x - Integer.parseInt(split[1]) >= 0) {
                for (int k = 1; k <= Integer.parseInt(split[1]); k++) {
                    if (map[x - k][y].equals("X")) {
                        move = false;
                        break;
                    }
                }
                if (move) x = x - Integer.parseInt(split[1]);
            }
        }
        
        answer[0] = x;
        answer[1] = y;
    }
}
