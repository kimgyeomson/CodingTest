import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a == b && a == c && b == c) {
            System.out.println(10000 + a * 1000);
        }
        else if(a == b || a == c) {
            System.out.println(1000 + a * 100);
        }
        else if(b == a || b == c) {
            System.out.println(1000 + b * 100);
        }
        else if(c == a || c == b) {
            System.out.println(1000 + c * 100);
        }
        else {
            if(a > b && a > c) {
                System.out.println(a * 100);
            }
            if(b > a && b > c) {
                System.out.println(b * 100);
            }
            if(c > a && c > b) {
                System.out.println(c * 100);
            }
        }
    }
}