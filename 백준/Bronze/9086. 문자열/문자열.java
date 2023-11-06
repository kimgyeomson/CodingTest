import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
             answer[i] = br.readLine();
        }
        for(int i = 0; i < n; i++) {
            answer[i] = String.valueOf(answer[i].charAt(0)) + String.valueOf(answer[i].charAt(answer[i].length()-1));
            System.out.println(answer[i]);
        }
    }
}
