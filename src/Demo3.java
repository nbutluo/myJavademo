public class Demo3 {

    public static void main(String[] args) {
        // int a=10;
        // double b=a;
        //
        // System.out.println(b);
        //
        // double c=20.123;  // 大转换小，必须显式，而且
        // int d = (int)c;
        // System.out.println(d);


        // 字符串转数字
        int ac = Integer.parseInt("456");
        System.out.println("ac ="+ ac);

        int d1 = (int) Double.parseDouble("3.45");
        System.out.println("d1 ="+ d1);

        // 数字转字符串
        String s1 = String.valueOf(200);
        System.out.println("s1 ="+ s1);

        String s2 = Integer.toString(456);
        System.out.println("s2 ="+ s2);

        int n1 = 11;
        Integer n2 = 33;






    }
}
