import impl.FileFilterImpl;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileFilter2 {
    public static void main(String[] args) {
    File file=new File("d:\\all");
    getAllfile(file);
}

    private static void getAllfile(File dir) {

        File [] file=dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        });
        for(File f:file){
            if(f.isDirectory()){
                getAllfile(f);

            }else{
                System.out.println(f);
            }

        }

    }

}

