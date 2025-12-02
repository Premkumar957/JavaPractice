package datahandling;
import java.util.ArrayList;
import java.util.List;
public class WrapperClasses {
    public static void main(String[] args) {
        System.out.println("Become the programmer you are meant to be!");
        
        Integer num1 = 500;
        System.out.println(num1);

        ArrayList<Integer> nums = new ArrayList<>(List.of(10, 20, 30));
        System.out.println(nums);

        Byte b1 = Byte.valueOf((byte) 5);
        Byte b2 = 6;  //autoboxing
        System.out.println(b1 + " " + b2);

        Short s1 = Short.valueOf((short) 10);
        Short s2 = 20;  //autoboxing
        System.out.println(s1 + " " + s2);

        Integer num2 = Integer.valueOf(10);
        Integer num3 = 45;  //autoboxing
        System.out.println(num2 + " " + num3);

        Long l1 = Long.valueOf(1000L);
        Long l2 = 2000L;  //autoboxing
        System.out.println(l1 + " " + l2);

        Float f1 = Float.valueOf(5.5f);
        Float f2 = 34.3f;  //autoboxing
        System.out.println(f1 + " " + f2);

        Double d1 = Double.valueOf(556.5);
        Double d2 = 454664.3D;
        System.out.println(d1 + " " + d2);

        Boolean flag1 = Boolean.valueOf(true);
        Boolean flag2 = false; //autoboxing
        System.out.println(flag1 + " " + flag2);


        Character ch1 = Character.valueOf('A');
        Character ch2 = 'S';  //autoboxing
        System.out.println(ch1 + " " + ch2);

        int x = Integer.parseInt("1223");
        double y = Double.parseDouble("10.5");
        boolean z = Boolean.parseBoolean("false");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        String s = Integer.toString(100);
        String q = Boolean.toString(false);
        String r = Double.toString(500.56);
        System.out.println(s + " " + q + " " + r);

        Integer ab = 500;
        int xy = ab.intValue();
        double xyz = ab.doubleValue();
        System.out.println(ab + " " + xy + " " + xyz);

        Integer number1 = 200;
        Integer number2 = 200;

        System.out.println(number1 == number2);

    }
}