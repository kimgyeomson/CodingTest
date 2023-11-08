import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split(" ");
        StringBuffer sf1 = new StringBuffer(n[0]);
        StringBuffer sf2 = new StringBuffer(n[1]);
        int a = Integer.parseInt(sf1.reverse().toString());
        int b = Integer.parseInt(sf2.reverse().toString());
        if(a < b) {
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }

    }
}
