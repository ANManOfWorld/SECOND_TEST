import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
       Integer max = Integer.MAX_VALUE;
       int int_Max = max.intValue();
        System.out.println(max);
        System.out.println(int_Max);
        System.out.println(max == int_Max);
        System.out.println(max.equals(int_Max));
        int one = 1;
        int three = 1;
        Integer two = Integer.valueOf(three);
        System.out.println(one == two);
        System.out.println(two.equals(one));

        int hex = 100;
        System.out.println(Integer.toHexString(hex));
    }
}