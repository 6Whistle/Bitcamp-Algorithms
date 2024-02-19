package kaupTest;

public class KaupMain {
    // Kaup 지수 구하는 프로그램
    private static double rangedRandomDouble(double start, double range){ return (Math.random() * range) + start; }
    private static double inputHeight(){
        double height = rangedRandomDouble(1.5, 0.5);
        System.out.printf("키 : %.1f\n", height * 100);
        return height;
    }
    private static double inputWeight(){
        double weight = rangedRandomDouble(30.0, 70.0);
        System.out.printf("몸무게 : %.1f\n", weight);
        return weight;
    }
    private static double calculateKaup(double height, double weight){    return weight / Math.pow(height, 2);  }

    public static void main(String[] args) {
        double height = inputHeight(), weight = inputWeight();
        System.out.printf("BMI : %.1f\n", calculateKaup(height, weight));
    }
}
