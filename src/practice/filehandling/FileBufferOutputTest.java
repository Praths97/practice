package practice.filehandling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileBufferOutputTest {
    public static void main(String[] args) {
        FileOutputStream fout=null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter empname :");
        String empname = scanner.next();
        System.out.println("Enter empId :");
        String empid = scanner.next();
        String s;
        try {
             fout = new FileOutputStream("C:/Prathibha/practice/newFile.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            byte buffer[] = new byte[1000];
            s = "Welcome " + empname + ", your Employee Id is " + empid;
            buffer = s.getBytes();
            bout.write(buffer);
            bout.flush();
            fout.flush();
        } catch (FileNotFoundException fileout) {
            fileout.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                fout.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
