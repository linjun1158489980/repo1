import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class zijieliu {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("a.txt");
        byte[] b = "黑马程序员".getBytes();
        fos.write(b);
        fos.write(97);
        fos.close();
    }
}
