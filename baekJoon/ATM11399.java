package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ATM11399 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine()), sum = 0;
        List<Integer> list =  Stream.of(br.readLine())
                .map(i -> i.split(" "))
                .flatMap(Arrays::stream)
                .map(Integer::parseInt)
                .sorted()
                .toList();
        for(int i : list)   sum += i * size--;
        System.out.println(sum);
    }
}
