package suanfa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int [][] array=new int[][]{{4,5,6,8},{7,8},{8,9,10}};

       boolean t= Find(7,array);
        System.out.println(t);
    }
    public static boolean Find(int target, int [][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int i=rows-1,j=0;
        while(i>=0 && j<cols){
            if(target<array[i][j])
                i--;
            else if(target>array[i][j])
                j++;
            else
                return true;
        }
        return false;
    }
}
