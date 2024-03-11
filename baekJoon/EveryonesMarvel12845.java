package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EveryonesMarvel12845 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        br.readLine();
        List<Integer> tmp = Stream.of(br.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .
                .collect(Collectors.toList());
        System.out.println(tmp.stream().reduce((i, j) -> i + j + tmp.get(0)).orElse(0) - tmp.get(0));
    }
}
