import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorld {

    static List<Integer> add(List<Integer> a){
        int tmp = a.get(0) + a.get(1);
        a.set(0, tmp);
        return a;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2);
//        List<Integer> list = new ArrayList<>();
//        list.add(0, 1);
//        list.add(1, 2);
        System.out.println(add(list).get(0));
        System.out.println(list.get(0));
    }
}
