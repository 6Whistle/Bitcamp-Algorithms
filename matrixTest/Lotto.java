package matrixTest;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
//        // 배열을 이용한 방식
//        int[] arr = new int[6];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = 1 + (int)(Math.random() * 45);
//            for(int j = 0; j < i; j++)  if(arr[i] == arr[j]){   i--;    break;      }
//        }
////        // 퀵정렬 이용
////        Arrays.sort(arr);
//        // 버블정렬 이용
//        for(int i = 0; i < arr.length - 1; i++)     for(int j = arr.length - 2, tmp; j >= 0; j--)
//            if(arr[j] > arr[j + 1]){    tmp = arr[j];   arr[j] = arr[j + 1];    arr[j + 1] = tmp;   }
//
//        for(int i : arr)  System.out.printf("%d, ", i);

        // 정렬된 set 이용한 방식
        final int lottosNum = 5;
        int[] cnt = new int[lottosNum];
        Set<Integer> result = new TreeSet<>();
        List<Set<Integer>> lottos = new ArrayList<>();
        for(createLotto(result); lottos.size() < lottosNum; lottos.add(new TreeSet<>()), createLotto(lottos.get(lottos.size() - 1)));
        for(int i : result)  for(int j = 0; j < lottos.size(); j++)
            if(lottos.get(j).contains(i))   cnt[j]++;
        System.out.println(result.toString());
        lottos.forEach( i -> System.out.println(i.toString()));
        for(int i = 0; i < cnt.length; i++)  System.out.printf("%d : %d등\n", i, 6 - cnt[i]);
    }

    static void createLotto(Set<Integer> s){    for(; s.size() < 6; s.add(1 + (int)(Math.random() * 10)));      }
}
