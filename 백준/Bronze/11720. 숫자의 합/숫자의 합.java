import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        int sum = 0;
        for(int i = 0; i < n; i ++) {
            int c = Integer.parseInt(String.valueOf(a.charAt(i)));
            sum += c;
        }
        System.out.println(sum);
    }
}
