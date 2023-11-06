import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] score = new double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }
        double max = Arrays.stream(score).max().getAsDouble();
        for(int i = 0; i < n; i++) {
            score[i] = score[i] / max * 100;
        }
        System.out.println(Arrays.stream(score).average().getAsDouble());
    }
}
