package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringChange1522 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int cntA = 0, cntMin = Integer.MAX_VALUE, tmp = 0;
        for(int i = 0; i < str.length(); i++)    cntA += str.charAt(i) == 'a' ? 1 : 0;
        for(int i = 0; i < cntA; tmp += str.charAt(i++) == 'b' ? 1 : 0);
        for(int i = 0; i < str.length(); tmp += (str.charAt((i + cntA) % str.length()) == 'b' ? 1 : 0) - (str.charAt(i++) == 'b' ? 1 : 0))
            cntMin = Math.min(cntMin, tmp);
        System.out.println(cntMin);
    }
}
