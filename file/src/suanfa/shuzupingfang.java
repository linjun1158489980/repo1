package suanfa;

import java.util.Arrays;

public class shuzupingfang {
    public static void main(String[] args) {
        reverseString(new char[]{'a','c','b','f','3'});
    }

    public static void reverseString(char[] s) {
        int j=s.length-1;  //得出数组s的长度，并减去1得出数组的下标索引
        System.out.println(s.length/2);  //测试s.length/2的结果，发现是取整。
        for(int i=0;i<s.length/2;i++){  //进行循环，目的就是为了数组进行位置的替换。替换次数就是长度的二分之一
            char tmp = s[i];  //类似冒泡排序，第一次遍历将第一个数据赋值给temp
            s[i] = s[j];//将最后一个数据赋值给第第一个数据。
            s[j] = tmp;//在将第一个数据赋值给最后一个数据。
            j--;//然后小标索引减一位，继续循环替换。
        }

        System.out.println(s);
    }



}
