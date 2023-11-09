import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < abc.length(); i++) {
            char c = abc.charAt(i);
            System.out.print(s.indexOf(c) + " ");
        }
    }
}
