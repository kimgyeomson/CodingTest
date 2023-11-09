import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] c = new char[5][15];
        String str = "";
        for(int i = 0; i < c.length; i++) {
            str = br.readLine();
            for(int j = 0; j < str.length(); j++) {
                c[i][j] = str.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(c[j][i] == '\0') continue;
                sb.append(c[j][i]);
            }
        }
        System.out.println(sb);
    }
}
