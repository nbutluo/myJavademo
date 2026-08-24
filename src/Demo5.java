import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {

        // 简写
        int[] scores = {90, 85, 100};
        String[] names = {"张三", "李四"};

        // 标准写法
        int[] scores2 = new int[]{80, 82, 93};

        int[] arr = new int[2];

        arr[0] = scores[0];
        arr[1] = scores[1];
        System.out.println(arr[0]);

        System.out.println("==============");

        int[] nums = {10, 20, 30};
        for (int i=0;i<nums.length;i++){
            System.out.println("第"+i+"元素是"+nums[i]);
        }


        for (int j : nums){
            System.out.println(j);
        }


        System.out.println("-------------------------");

        int[] nums2 = {5,2,8,1};
        System.out.println(Arrays.toString(nums2));

        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));


    }
}
