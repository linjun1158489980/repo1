package shixi7_19;

import java.util.Arrays;
//136. 只出现一次的数字
//给定一个非空整数数组，除了某个元素只出现一次以外
//其余每个元素均出现两次。找出那个只出现了一次的元素。
public class zhichuxianyicishuzi {
    public static void main(String[] args) {
          zhichuxianyicishuzi z=new zhichuxianyicishuzi();
            int y=z.singleNumber(new int[]{2,2,3,3,13,6,6,5,5});
        System.out.println(y);
    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);//先将数组进行排序，从小到大，排序完之后可以判断出数字要么在开头要么在结尾
        for (int i=0;i<nums.length-2; i+=2){//循环数组，相邻元素进行比较，i<nums.length-1防止数组下标越界
            if(nums[i]!=nums[i+1]){//进行比较
                return nums[i];
            }
        }return nums[nums.length-1];//如果都相同的话就返回最后一个即可

    }
}
