import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb.append(st.nextToken()).append(" ").append(st.nextToken()).reverse();
        String[] n = sb.toString().split(" ");
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n.length; i++) {
            result.add(Integer.parseInt(n[i]));
        }
        int max = 0;
        for(int i = 0; i < result.size(); i++) {
            if(max < result.get(i)) {
                max = result.get(i);
            }
        }
        System.out.println(max);
    }
}
