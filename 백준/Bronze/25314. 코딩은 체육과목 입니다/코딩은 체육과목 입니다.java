import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()) / 4;
        String n = "";

        for(int i = 0; i < a; i++) {
            n += "long ";
        }
        System.out.println(n + "int");
    }
}
