import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        String text = " Java is Awesome! ";

        String cleanText =  text.trim();
        System.out.println(cleanText);

        System.out.println(cleanText.substring(0,4));

        // 替换
        System.out.println(cleanText.replace("Awesome", "Great"));
        // 拆分

        String[] words = cleanText.split(" ");
        System.out.println(words[0]);
    }
}
