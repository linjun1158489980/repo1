import com.sun.deploy.util.StringUtils;

public class demo3 {
    public static void main(String[] args) {
             int s=sum(5);
        System.out.println(s);
    }

    public static int sum(int n) {
        if(n==1){
            return 1;
        }


        return n+sum(n-1)  ;

    }



}