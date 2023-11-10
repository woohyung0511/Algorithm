import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int R, C, totalS, totalW;
    static String[][] maps;
    static boolean[][] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();

        maps = new String[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String line = sc.next();
            for (int j = 0; j < C; j++) {
                maps[i][j] = String.valueOf(line.charAt(j));
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (maps[i][j].equals("o") && !visited[i][j]) {
                    bfs(i, j, 1, 0);
                }

                if (maps[i][j].equals("v") && !visited[i][j]) {
                    bfs(i, j, 0, 1);
                }
            }
        }

        System.out.println(totalS + " " + totalW);
    }

    public static void bfs(int x, int y, int sheep, int wolf) {

        Queue<Node> q = new LinkedList<>();

        q.add(new Node(x, y));
        visited[x][y] = true;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!q.isEmpty()) {

            Node node = q.poll();

            int currentX = node.x;
            int currentY = node.y;

            for (int[] direction : directions) {

                int newX = currentX + direction[0];
                int newY = currentY + direction[1];

                if (newX >= 0 && newX < R && newY >= 0 && newY < C && !visited[newX][newY] && !maps[newX][newY].equals("#")) {
                    q.add(new Node(newX, newY));
                    visited[newX][newY] = true;

                    if (maps[newX][newY].equals("o")) {
                        sheep++;
                    } else if (maps[newX][newY].equals("v")) {
                        wolf++;
                    }
                }
            }
        }

        if (wolf < sheep) {
            wolf = 0;
        } else {
            sheep = 0;
        }

        totalW += wolf;
        totalS += sheep;
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
