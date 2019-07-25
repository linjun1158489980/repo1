package reader;

import java.io.FileReader;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt"); // 定义变量，保存有效字符个数
       int len ;
       char[] cbuf = new char[2];
       while ((len = fr.read(cbuf))!=-1) {
           System.out.println(new String(cbuf,0,len));
       }
           fr.close();
    }
}
