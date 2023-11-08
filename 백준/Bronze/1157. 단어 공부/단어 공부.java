import java.io.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().toLowerCase();
        HashMap<Character, Integer> n = new HashMap<>();
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(n.containsKey(c)) {
                n.put(c, n.get(c) + 1);
            }
            else {
                n.put(c, 1);
            }
        }
        String c = "";
        int count = 0;
        for(Map.Entry<Character, Integer> i : n.entrySet()) {
            if(i.getValue() > count) {
                c = String.valueOf(i.getKey());
                count = i.getValue();
            }
            else if(i.getValue() == count) {
                c = "?";
            }
        }
        System.out.println(c.toUpperCase(Locale.ROOT));
    }
}
