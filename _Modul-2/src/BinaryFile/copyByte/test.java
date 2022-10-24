package BinaryFile.copyByte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        try {
            FileInputStream inputFile = new FileInputStream("D:\\CG\\_Modul-2\\src\\BinaryFile\\copyByte\\demo.txt");
            FileOutputStream outputFile = new FileOutputStream("D:\\CG\\_Modul-2\\src\\BinaryFile\\copyByte\\result.txt");
            ArrayList<Byte> arr = new ArrayList<>();
            while (inputFile.read()>0){
                arr.add((byte) inputFile.read());
            }
            for (int i = 0; i < arr.size(); i++) {
                outputFile.write(arr.get(i));
            }
            outputFile.close();
            inputFile.close();
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
