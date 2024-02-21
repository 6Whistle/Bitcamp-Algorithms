package beakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Changes5585 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int cnt = 0;
        for(int i = 500, money = 1000 - Integer.parseInt(br.readLine()); i > 0 && money > 0;) {
            cnt += money / i;   money %= i;     i /= 5;
            cnt += money / i;   money %= i;     i /= 2;
        }
        System.out.println(cnt);
    }
}
