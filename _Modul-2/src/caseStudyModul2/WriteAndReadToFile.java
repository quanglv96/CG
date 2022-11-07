package caseStudyModul2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteAndReadToFile {

    public static void writeFile(String path, ArrayList list) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static ArrayList writeToList(String path, ArrayList list) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList) ois.readObject();
            fis.close();
            ois.close();
        } catch (Throwable StackTraceElement) {
        }
        return list;
    }
}
