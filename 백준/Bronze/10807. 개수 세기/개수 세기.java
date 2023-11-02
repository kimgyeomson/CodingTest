import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int result = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            if(a[i] == result) {
                count++;
            }
        }
        System.out.println(count);

    }
}
