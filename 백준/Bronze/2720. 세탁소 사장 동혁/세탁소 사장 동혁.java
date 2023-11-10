import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int q = 25;
        int d = 10;
        int ni = 5;
        int p = 1;
        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            sb.append(m / q + " ");
            m %= q;
            sb.append(m / d + " ");
            m %= d;
            sb.append(m / ni + " ");
            m %= ni;
            sb.append(m / p + "\n");
            m %= p;
        }
        System.out.println(sb);
    }
}
