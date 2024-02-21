package beakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password2464 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(br.readLine()), i, j, check, tmp;

        for(i = 0, tmp = n, check = 0b10; tmp > 0 && (tmp & 0b11) != check; i++, tmp >>= 1);
        if(tmp == 0)   System.out.print("0 ");
        else{
            for(j = 0, tmp = (tmp >> 2) << 1; j <= i; tmp = (tmp << 1) | (Long.bitCount(n) != Long.bitCount(tmp) ? 1 : 0), j++);
            System.out.print(tmp + " ");
        }

        for(i = 0, tmp = n, check = 0b01; tmp > 0 && (tmp & 0b11) != check; i++, tmp >>= 1);
        for(j = 0, tmp = ((tmp >> 2) << 1) | 1; j <= i; tmp <<= 1, j++);
        for(j = 0; Long.bitCount(n) != Long.bitCount(tmp); tmp |= ((long)1 << j++));
        System.out.println(tmp);
    }
}
