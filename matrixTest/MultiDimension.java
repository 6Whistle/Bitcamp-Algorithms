package matrixTest;

import mathTest.RandomTest;
import java.util.Arrays;

public class MultiDimension {
    private static final int randClassMin = 1, randClassRange = 3;
    private static final int randStudentMin = 2, randStudentRange = 9;
    private static final int randScoreMin = 0, randScoreRange = 100;
    private static int[][] arr = null;
    private static int rangedRandomNumber(int startNum, int range){  return (int)(Math.random() * range) + startNum;    }
    private static void inputStudent(int index){
        arr[index] = new int[rangedRandomNumber(randStudentMin, randStudentRange)];
        System.out.printf("\n%d반 %d명 점수\n", index + 1, arr[index].length);
        for(int j = 0; j < arr[index].length; j++){
            arr[index][j] = rangedRandomNumber(randScoreMin, randScoreRange);
            System.out.printf("%d ", arr[index][j]);
        }
    }
    private static void printAveAndMax(int index){
        int sum = 0, max = 0;
        for(int j = 0; j < arr[index].length; sum += arr[index][j], max = Math.max(max, arr[index][j++]));
        System.out.printf("%d반 평균 : %.2f, 최고점 : %d\n", index + 1, (float)sum / arr[index].length, max);
    }
    public static void main(String[] args) {
        arr = new int[rangedRandomNumber(randClassMin, randClassRange)][];

        System.out.printf("계산할 반 수 : %d\n", arr.length);
        for(int i = 0; i < arr.length; i++)    inputStudent(i);

        System.out.println("\n평균");
        for(int i = 0; i < arr.length; i++)     printAveAndMax(i);
    }
}
