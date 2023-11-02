import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if(a.equals("0")) {
                System.out.println(sb);
                break;
            }
            sb.append(Integer.parseInt(a) + Integer.parseInt(b)).append("\n");

        }
    }
}
