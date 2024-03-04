package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnouncePassword4659 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static char[] vow = {'a', 'e', 'i', 'o', 'u'};
    static boolean checkVow(char c){
        for(char tmp : vow) if(c == tmp)     return true;
        return false;
    }

    static boolean checkPassword(String str){
        boolean hasVow = checkVow(str.charAt(0));
        for(int i = 0, cntBefore = 1; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i) != 'e' && str.charAt(i) != 'o')  return false;
            cntBefore = checkVow(str.charAt(i)) == checkVow(str.charAt(i + 1)) ? cntBefore + 1 : 1;
            hasVow |= checkVow(str.charAt(i + 1));
            if(cntBefore > 2)   return false;
        }
        return hasVow;
    }
    public static void main(String[] args) throws IOException {
        String str;
        while(!(str = br.readLine()).equals("end"))
            System.out.printf("<%s> is %s\n", str, (checkPassword(str) ? "acceptable." : "not acceptable."));
    }
}
