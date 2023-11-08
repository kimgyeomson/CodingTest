import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        String a = sb.toString();
        String b = sb.reverse().toString();
        if(a.equals(b)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
