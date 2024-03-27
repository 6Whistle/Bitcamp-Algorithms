package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenClock2525 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        h = (h + (m += Integer.parseInt(br.readLine())) / 60) % 24;
        m %= 60;
        System.out.println(h + " " + m);
    }
}
