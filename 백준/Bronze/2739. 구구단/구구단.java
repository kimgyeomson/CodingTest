import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = 1;

        while(count <= 9) {
            System.out.println(a + " * " + count + " = " + (a * count));
            count++;
        }
    }
}