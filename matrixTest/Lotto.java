package matrixTest;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        final int LOTTOS_BUY_COUNT = 2, LOTTOS_GENERATE_COUNT = 3;
        BuyLottos bl = new BuyLottos(LOTTOS_BUY_COUNT);
        Lottos l = new Lottos(LOTTOS_GENERATE_COUNT);

        Set<Integer> result = l.generateLotto();
        bl.generateLottos();
        l.generateLottos();

        System.out.println("------------ 로또 ------------");
        System.out.println(result);

        bl.checkLottos(result);
        bl.printLottos(result);

        l.checkLottos(result);
        l.printLottos(result);
    }
}

class BuyLottos extends Lottos{
    BuyLottos(int size){    super(size);    }

    @Override
    public Set<Integer> generateLotto() {
        Set<Integer> lotto = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("로또 번호 입력");
        for(int i = 0; i < 6; i++)      lotto.add(scan.nextInt());
        System.out.println("입력 번호 : " + lotto.toString());
        return lotto;
    }
}

class Lottos implements LottoService {
    public int SIZE = 0;
    protected int[] cnt;
    protected List<Set<Integer>> lottos;

    Lottos(){}
    Lottos(int size){
        SIZE = size;
        cnt = new int[SIZE];
        lottos = new ArrayList<>();
    }
    @Override
    public Set<Integer> generateLotto() {
        Set<Integer> lotto = new TreeSet<>();
        for(; lotto.size() < 6; lotto.add(1 + (int)(Math.random() * 10)));
        return lotto;
    }

    @Override
    public void generateLottos() {
        for(;lottos.size() < SIZE; lottos.add(this.generateLotto()));
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

interface LottoService{
    Set<Integer> generateLotto();
    void generateLottos();
    void checkLottos(Set<Integer> result);
    void printLottos(Set<Integer> result);
}
