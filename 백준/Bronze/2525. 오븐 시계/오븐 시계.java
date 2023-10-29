import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(br.readLine());
        int a = 0;
        m = m + s;
        if(m >= 60) {
            a = m / 60;
            h += a;
            m = m % 60;
            if(h >= 24) {
                h = h - 24;
            }
            System.out.println(h + " " + m);
        }
        else {
            System.out.println(h + " " + m);
        }
    }
}