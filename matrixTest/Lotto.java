package matrixTest;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        final int LOTTOS_BUY_COUNT = 2, LOTTOS_GENERATE_COUNT = 3;
        int[] cnt;
        Set<Integer> result = createLotto();
        List<Set<Integer>> lottos = new ArrayList<>();

        cnt = checkLottos(result, lottos);
        printLottos(result, lottos, cnt);
    }

    static Set<Integer> createLotto(){
        Set<Integer> s = new TreeSet<>();
        for(; s.size() < 6; s.add(1 + (int)(Math.random() * 10)));
        return s;
    }
    static Set<Integer> BuyLotto(){
        Set<Integer> lotto = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("로또 번호 입력");
        for(int i = 0; i < 6; i++)      lotto.add(scan.nextInt());
        System.out.println("입력 번호 : " + lotto.toString());
        return lotto;
    }

    static int[] checkLottos(Set<Integer> result, List<Set<Integer>> lottos){
        int[] cnt = new int[lottos.size()];
        for(int i : result)  for(int j = 0; j < lottos.size(); j++)
            if(lottos.get(j).contains(i))   cnt[j]++;
        return cnt;
    }

    static void printLottos(Set<Integer> result, List<Set<Integer>> lottos, int[] cnt){
        System.out.println("------------ 결과 ------------");
        System.out.println(result.toString());
        System.out.println("------------ 로또 ------------");
        lottos.forEach(i -> System.out.println(i.toString()));
        System.out.println("------------ 등수 ------------");
        for(int i = 0; i < cnt.length; i++)  System.out.printf("%d : %d등\n", i, 6 - cnt[i]);
    }
}

class AutoLotto implements lotto{
    public static int SIZE = 0;
    int cnt[];
    private List<Set<Integer>> lottos;

    AutoLotto(){}
    AutoLotto(int size){
        SIZE = size;
        int[] cnt = new int[lottos.size()];
        lottos = new ArrayList<>();
    }
    @Override
    public Set<Integer> generateLotto() {
        Set<Integer> s = new TreeSet<>();
        for(; s.size() < 6; s.add(1 + (int)(Math.random() * 10)));
        return s;
    }

    @Override
    public void generateLottos() {
        for(;lottos.size() < SIZE; lottos.add(generateLotto()));
    }


    @Override
    public void checkLottos(Set<Integer> result) {
        for(int i : result)  for(int j = 0; j < lottos.size(); j++)
            if(lottos.get(j).contains(i))   cnt[j]++;
    }

    @Override
    public void printLottos(Set<Integer> result) {
        System.out.println("------------ 로또 ------------");
        lottos.forEach(i -> System.out.println(i.toString()));
        System.out.println("------------ 등수 ------------");
        for(int i = 0; i < cnt.length; i++)  System.out.printf("%d : %d등\n", i, 6 - cnt[i]);
    }
}

class BuyLotto implements lotto{
    public static int SIZE = 0;
    int cnt[];
    private List<Set<Integer>> lottos;

    BuyLotto(){}
    BuyLotto(int size){
        SIZE = size;
        int[] cnt = new int[lottos.size()];
        lottos = new ArrayList<>();
    }
    @Override
    public Set<Integer> generateLotto() {
        Set<Integer> lotto = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("로또 번호 입력");
        for(int i = 0; i < 6; i++)      lotto.add(scan.nextInt());
        System.out.println("입력 번호 : " + lotto.toString());
        return lotto;
    }

    @Override
    public void generateLottos() {
        for(;lottos.size() < SIZE; lottos.add(generateLotto()));
    }


    @Override
    public void checkLottos(Set<Integer> result) {
        for(int i : result)  for(int j = 0; j < lottos.size(); j++)
            if(lottos.get(j).contains(i))   cnt[j]++;
    }

    @Override
    public void printLottos(Set<Integer> result) {
        System.out.println("------------ 로또 ------------");
        lottos.forEach(i -> System.out.println(i.toString()));
        System.out.println("------------ 등수 ------------");
        for(int i = 0; i < cnt.length; i++)  System.out.printf("%d : %d등\n", i, 6 - cnt[i]);
    }
}

interface lotto{
    Set<Integer> generateLotto();
    void generateLottos();
    void checkLottos(Set<Integer> result);
    void printLottos(Set<Integer> result);
}
