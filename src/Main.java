import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.ArrayList;
import java.util.Queue;
import javax.sound.sampled.Line;

public class Main {

    static ArrayList<Integer>[] ar;
    static Queue<Integer> q;
    static boolean[] visited;

    static int N, K, M;
    static int sta;     // station

    public static void main(String[] args) throws IOException {

        String[] strs;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        strs = br.readLine().split("");

        N = Integer.parseInt(strs[0]);
        K = Integer.parseInt(strs[1]);
        M = Integer.parseInt(strs[2]);

        ar = new ArrayList<Integer>[N + 1]();
        visited = new int[N + M + 1];
        q = new Queue<Integer>();
        visited = new boolean[N + M + 1];

        for (int i = N + 1; i < N + M + 1; i++) {
            strs = br.readLine().split("");

            for (int j = 0; j < K; j++) {
                sta = strs[j];
                ar[sta].add(i);
                ar[i].add(sta);
            }
        }

        q.add(1);

        while(q.{

        }
    }
}
