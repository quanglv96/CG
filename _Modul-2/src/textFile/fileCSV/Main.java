package textFile.fileCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\CG\\_Modul-2\\src\\textFile\\fileCSV\\fileDemo.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                ArrayList<String> newArr = new ArrayList<>(Arrays.asList(line.split(",")));
                System.out.println(new CSV(newArr.get(0), newArr.get(1), newArr.get(2)));
            }

        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
