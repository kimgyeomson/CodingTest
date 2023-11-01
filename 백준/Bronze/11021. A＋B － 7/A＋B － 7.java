import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("Case #")
                    .append(i)
                    .append(": ")
                    .append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))
                    .append("\n");
        }
        System.out.println(sb);
    }
}
