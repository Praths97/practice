package practice.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

public class FileReverseReading {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:/Prathibha/practice/datareverse.txt"));
            String strCurrentLine;
            StringBuilder reverseTheString = new StringBuilder();


            while ((strCurrentLine = bufferedReader.readLine()) != null) {
                reverseTheString.append(strCurrentLine);
                reverseTheString.reverse();
                System.out.println("The Reversed File Content is "+reverseTheString);
            }
        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
}
