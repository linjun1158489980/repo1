package suanfa;

import java.util.Arrays;

public class zhengheshuzu {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int len=nums1.length;    //先取出nums1的长度
        int len2=nums2.length;   //在取出num2的长度
        int temp=len-len2;       //将两数组长度相减
        for(int i=0;i<len2;i++){  //循环num2长的次数，目的是为了将num2的每一个数取出来
            nums1[temp++]=nums2[i]; //每遍历一次temp加一位，也就是num1索引加一位，然后把num2的每一位的值都一次一次赋值给num1.
        }
        Arrays.sort(nums1);//赋值完毕后用sort方法进行排序（从小到大），
        return nums1;//排序完毕直接返回！
        
    }

    public static void main(String[] args) {
         int [] num2=merge(new int[]{1, 2, 32, 6,8,10,0,0,0,0,0},4,new int[]{7,34,3,5,4},5);
         for (int i=0;i<num2.length;i++){
        System.out.println(num2[i]);}

    }
}
