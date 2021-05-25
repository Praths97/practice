package practice.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEmailReg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = scanner.next();
        System.out.println("Enter emailId :");
        String emailid = scanner.next();
        String s;
        try {
            FileWriter fileWriter = new FileWriter("C:/Prathibha/practice/newFile.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            s = "Welcome " + name + ", Thank you for registering your emailid " + emailid;
            bufferedWriter.write(s);
            bufferedWriter.flush();
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
