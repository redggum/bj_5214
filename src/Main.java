import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] ar;
    static int[] used;

    static int N, K, M;

    public static void main(String[] args) throws IOException {

        String[] strs;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        strs = br.readLine().split("");

        N = Integer.parseInt(strs[0]);
        K = Integer.parseInt(strs[1]);
        M = Integer.parseInt(strs[2]);

        ar = new ArrayList<Integer>[N + 1]();
        used = new int[N + 1];

        for (int i = 0; i < M; i++) {
            strs = br.readLine().split("");

            
        }
    }
}
