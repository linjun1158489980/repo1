import java.io.File;

public class demo2 {
    public static void main(String[] args) {
        File dir=new File("D:\\");
        File[] file=dir.listFiles();
       for(File file1:file){
           System.out.println(file);
       }
    }
}
