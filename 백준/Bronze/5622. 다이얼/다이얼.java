import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int sum = 0;
        for(int i = 0; i < n.length(); i++) {
            char c =  n.charAt(i);
            int a = (int) c;
            if(a >= 87) sum += 10;
            else if(a >= 84) sum += 9;
            else if(a >= 80) sum += 8;
            else if(a >= 77) sum += 7;
            else if(a >= 74) sum += 6;
            else if(a >= 71) sum += 5;
            else if(a >= 68) sum += 4;
            else if(a >= 65) sum += 3;
            else sum += 2;
        }
        System.out.println(sum);
    }
}
