package shixi7_18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("a.txt"));
        String line=null;  int s=0 ;
        while ((line=br.readLine())!=null){
            System.out.print(line);
            System.out.println("----------");

            s++;
        }
        System.out.println(s);
        br.close();

    }
}
