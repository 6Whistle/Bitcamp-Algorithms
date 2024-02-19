package mathTest;

public class RandomTest {
    public static int returnRandomNumber(){   return (int)(Math.random() * 100);   }
    public static void main(String[] args) {
        int randomNum = returnRandomNumber();
        System.out.println(randomNum);
    }
}
