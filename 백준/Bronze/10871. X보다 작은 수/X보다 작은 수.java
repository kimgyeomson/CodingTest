import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int[] x = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            if(x[i] < a) {
                System.out.print(x[i] + " ");
            }
        }
    }
}
