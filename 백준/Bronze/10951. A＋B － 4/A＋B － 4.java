import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String run;
        while((run = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(run, " ");
            String a = st.nextToken();
            String b = st.nextToken();

            sb.append(Integer.parseInt(a) + Integer.parseInt(b)).append("\n");

        }
        System.out.println(sb);
    }
}
