public class HelloWorld {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(s);
        String s1 = str(s);
        System.out.println(s);
        System.out.println(s1);
    }

    public static String str(String str){
        str += "b";
        System.out.println(str);
        return str;
    }
}
