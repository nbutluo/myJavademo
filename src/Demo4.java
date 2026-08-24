public class Demo4 {
    public static  void main(String[] args){

        String str1 = "abc";
        String str2 = "abc";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String ss =  "hello".substring(1,4);
        System.out.println(ss);


        System.out.println("----------------------");

        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
