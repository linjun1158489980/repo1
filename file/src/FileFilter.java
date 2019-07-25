import impl.FileFilterImpl;

import java.io.File;

public class FileFilter {
    public static void main(String[] args) {
    File file=new File("d:\\all");
    getAllfile(file);
}

    private static void getAllfile(File dir) {

        File [] file=dir.listFiles(new FileFilterImpl());
        for(File f:file){
            if(f.isDirectory()){
                getAllfile(f);

            }else{
                System.out.println(f);
            }

        }

    }

}

