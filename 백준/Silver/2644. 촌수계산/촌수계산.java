import java.util.*;
public class Main {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int result = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new ArrayList[N+1];
        for (int i = 0; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x].add(y);
            arr[y].add(x);
        }
        visited = new boolean[N+1];
        DFS(t1, t2, 0);
        System.out.println(result);

    }
    public static void DFS(int s, int e, int cnt) {
        if (s == e) {
            result = cnt;
        }
        visited[s] = true;
        for (int i: arr[s]) {
            if (!visited[i]) {
                DFS(i, e, cnt+1);
            }
        }
    }
}