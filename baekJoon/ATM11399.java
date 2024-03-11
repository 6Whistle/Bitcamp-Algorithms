package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ATM11399 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        AtomicInteger size = new AtomicInteger(Integer.parseInt(br.readLine()));
        System.out.println(Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .reduce(0, (i, j) -> i + j * size.getAndDecrement()));
    }
}
