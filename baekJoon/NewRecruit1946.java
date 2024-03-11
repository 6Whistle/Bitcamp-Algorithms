package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static java.util.Comparator.comparingInt;

public class NewRecruit1946 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int repeat = Integer.parseInt(br.readLine());
        for(int i = 0; i < repeat; i++){
            AtomicInteger min = new AtomicInteger(Integer.MAX_VALUE);
            System.out.println(
                    IntStream.range(0, Integer.parseInt(br.readLine()))
                    .mapToObj(j -> {
                        try {
                            StringTokenizer st = new StringTokenizer(br.readLine());
                            return Arrays.asList(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
                        } catch (IOException e) {   throw new RuntimeException(e);  }
                    }).sorted(comparingInt(arr -> arr.get(0)))
                    .filter(arr -> arr.get(1) < min.get() && min.getAndSet(arr.get(1)) > 0)
                    .count());
        }
    }
}
