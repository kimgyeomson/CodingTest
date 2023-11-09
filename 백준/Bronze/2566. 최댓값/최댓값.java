import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] ab = new int[9][9];
        int max = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i < 9; i++) {
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < 9; j++) {
                ab[i][j] = Integer.parseInt(input[j]);
                if(max < ab[i][j]) {
                    max = ab[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((a + 1) + " " + (b + 1));
    }
}
