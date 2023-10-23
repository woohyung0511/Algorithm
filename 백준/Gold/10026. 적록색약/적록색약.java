import java.util.*;

public class Main {
    static int num;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        String[][] area = new String[num][num];
        visited = new boolean[num][num];

        for (int i = 0; i < num; i++) {
            String input = sc.next();
            for (int j = 0; j < num; j++) {
                area[i][j] = input.substring(j, j + 1);
            }
        }

        int result = 0;
        int result2 = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, area);
                    result++;
                }
            }
        }

        // 'R'을 'G'로 변경
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (area[i][j].equals("R")) {
                    area[i][j] = "G";
                }
            }
        }

        visited = new boolean[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, area);
                    result2++;
                }
            }
        }

        System.out.println(result + " " + result2);
    }

    public static void bfs(int startX, int startY, String[][] area) {
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(startX, startY));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;

            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];

                if (newX >= 0 && newX < num && newY >= 0 && newY < num && !visited[newX][newY] && area[newX][newY].equals(area[startX][startY])) {
                    visited[newX][newY] = true;
                    queue.add(new Node(newX, newY));
                }
            }
        }
    }

    static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
