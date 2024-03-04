package matrixTest;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        final int LOTTOS_BUY_COUNT = 2, LOTTOS_GENERATE_COUNT = 3;
        Lottos iBuyLottos = new Lottos(), autoBuyLottos = new Lottos();
        LottoService iBuyService = IBuyLotto.getInstance(), autoBuyService = AutoBuyLotto.getInstance();

        Set<Integer> result = autoBuyService.generateLotto();
        iBuyService.generateLottos(iBuyLottos, LOTTOS_BUY_COUNT);
        autoBuyService.generateLottos(autoBuyLottos, LOTTOS_GENERATE_COUNT);

        System.out.println("------------ 로또 ------------");
        System.out.println(result);

        iBuyService.checkLottos(iBuyLottos, result);
        autoBuyService.checkLottos(autoBuyLottos, result);

        iBuyService.printLottos(iBuyLottos, result);
        autoBuyService.printLottos(autoBuyLottos, result);
    }
}

class Lottos{
    protected int[] cnt;
    protected List<Set<Integer>> lottos;

    public int[] getCnt() {
        return cnt;
    }

    public void setCnt(int[] cnt) {
        this.cnt = cnt;
    }

    public List<Set<Integer>> getLottos() {
        return lottos;
    }

    public void setLottos(List<Set<Integer>> lottos) {
        this.lottos = lottos;
    }
}

class IBuyLotto extends AutoBuyLotto{
    private static LottoService instance = new IBuyLotto();
    private IBuyLotto(){    super();    }

    public static LottoService getInstance() {
        return instance;
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
}

class AutoBuyLotto implements LottoService{

    private static LottoService instance = new AutoBuyLotto();

    protected AutoBuyLotto(){}

    public static LottoService getInstance() {
        return instance;
    }

    @Override
    public Set<Integer> generateLotto() {
        Set<Integer> lotto = new TreeSet<>();
        for(; lotto.size() < 6; lotto.add(1 + (int)(Math.random() * 10)));
        return lotto;
    }

    @Override
    public void generateLottos(Lottos lottos, int size) {
        List<Set<Integer>> lottosGen = new ArrayList<>();
        for(;lottosGen.size() < size; lottosGen.add(this.generateLotto()));
        lottos.setLottos(lottosGen);
    }


    @Override
    public void checkLottos(Lottos lottos, Set<Integer> result) {
        int[] cnt = new int[lottos.getLottos().size()];
        for(int i : result)  for(int j = 0; j < lottos.getLottos().size(); j++)
            if(lottos.getLottos().get(j).contains(i))   cnt[j]++;
        lottos.setCnt(cnt);
    }

    @Override
    public void printLottos(Lottos lottos, Set<Integer> result) {
        System.out.println("------------ 로또 ------------");
        lottos.getLottos().forEach(i -> System.out.println(i.toString()));
        System.out.println("------------ 등수 ------------");
        for(int i = 0; i < lottos.getCnt().length; i++)  System.out.printf("%d : %d등\n", i + 1, 6 - lottos.getCnt()[i] + 1);
    }
}

interface LottoService{
    Set<Integer> generateLotto();
    void generateLottos(Lottos lottos, int size);
    void checkLottos(Lottos lottos, Set<Integer> result);
    void printLottos(Lottos lottos, Set<Integer> result);
}
