package beakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String1120 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken(), b = st.nextToken();
        for(int i = 0, localMin = 0; i < b.length() - a.length() + 1; min = Math.min(min, localMin), localMin = 0, i++)
            for(int j = 0; j < a.length(); localMin += (a.charAt(j) == b.charAt(i + j++) ? 0 : 1));
        System.out.println(min);
    }
}
