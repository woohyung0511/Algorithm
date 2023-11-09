import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] jumps = new int[N];
        for (int i = 0; i < N; i++) {
            jumps[i] = sc.nextInt();
        }

        int[] visited = new int[N];
        Arrays.fill(visited, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int jump = jumps[current];

            for (int i = 1; i <= jump; i++) {
                int next = current + i;
                if (next < N && visited[next] == -1) {
                    visited[next] = visited[current] + 1;
                    queue.add(next);
                }
            }
        }

        if (visited[N - 1] == -1) {
            System.out.println(-1);
        } else {
            System.out.println(visited[N - 1]);
        }
    }
}
