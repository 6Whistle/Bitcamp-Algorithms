package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringChange1522 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int cntA = 0, cntMin = Integer.MAX_VALUE;
        for(int i = 0; i < str.length(); i++)    cntA += str.charAt(i) == 'a' ? 1 : 0;
        for(int i = 0, cnt = 0; i < str.length(); i++, cnt = 0){
            for(int j = 0; j < cntA; j++){
                cnt += str.charAt((i + j) % str.length()) == 'b' ? 1 : 0;
            }
            cntMin = Math.min(cnt, cntMin);
        }
        System.out.println(cntMin);
    }
}
