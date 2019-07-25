public class demo4 {
    public static void main(String[] args) {
        int result=cheng(5);
        System.out.println(result);
    }

    private static int cheng(int i) {
              if(i==1){
                  return 1;
              }

        return i*cheng(i-1);
    }
}
