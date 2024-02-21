package beakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlubAndSwitch2138 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine()), cnt1 = 0, cnt2 = 0;
        String startBlub = br.readLine(), endBlub = "0" + br.readLine() + "0";
        StringBuilder sb1 = new StringBuilder("0" + startBlub + "X"), sb2 = new StringBuilder("1" + startBlub + "X");

        for(int i = 1, j; i < endBlub.length() - 1; i++){
//            System.out.printf("%d, %s, %s\n", (i - 1), sb1, sb2);
            if(sb1.charAt(i - 1) != endBlub.charAt(i - 1))   for(j = -1, cnt1++; j < 2; j++)  sb1.setCharAt(i + j, sb1.charAt(i + j) == '0' ? '1' : '0');
            if(sb2.charAt(i - 1) != endBlub.charAt(i - 1))   for(j = -1, cnt2++; j < 2; j++)  sb2.setCharAt(i + j, sb2.charAt(i + j) == '0' ? '1' : '0');
        }
//        System.out.printf("%s, %s\n", sb1, sb2);
        if(sb1.substring(1, sb1.length() - 1).compareTo(endBlub.substring(1, endBlub.length() - 1)) != 0)     cnt1 = Integer.MAX_VALUE;
        if(sb2.substring(1, sb1.length() - 1).compareTo(endBlub.substring(1, endBlub.length() - 1)) != 0)     cnt2 = Integer.MAX_VALUE;
        System.out.println(cnt1 == Integer.MAX_VALUE && cnt2 == Integer.MAX_VALUE ? -1 : Math.min(cnt1, cnt2));
    }
}
