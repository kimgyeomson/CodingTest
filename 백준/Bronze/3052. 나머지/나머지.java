import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> li = new HashSet<>();
        int result;
        for(int i = 0; i < 10; i++) {
            result = Integer.parseInt(br.readLine());
            li.add(result % 42);
        }
        System.out.println(li.size());
    }
}