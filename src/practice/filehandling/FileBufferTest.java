package practice.filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileBufferTest {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:/Prathibha/practice/Data.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            byte[] buf = new byte[100];
            long total = 0;
            System.out.print("The content of the file read using is BufferedInputStream :");
            while (true) {
                int r = bin.read(buf);
                if (r == -1) {
                    break;
                }
            } String s = new String(buf);
            System.out.print( s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
