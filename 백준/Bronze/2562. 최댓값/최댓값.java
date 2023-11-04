import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[9];
        int max = 0;
        for(int i = 0; i < 9; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }
        max = Arrays.stream(n).max().getAsInt();
        int idx = 0;
        for(int i = 0; i < 9; i++) {
            if(max == n[i]) {
                idx = i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(idx + 1);
    }
}
