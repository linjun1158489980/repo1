import com.sun.deploy.util.StringUtils;

import java.io.File;

public class file {
    
    public static void main(String[] args) {
        File file=new File("d:\\all");
         getAllfile(file);
    }

    private static void getAllfile(File dir) {
        File [] file=dir.listFiles();
        for(File f:file){
           if(f.isDirectory()){
               getAllfile(f);
           }
           else{
               String s=f.getName();
               boolean b=s.endsWith(".java");
               if(b){  System.out.println(f);}

           }
        }

    }

}
