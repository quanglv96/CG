package textFile.copyText;

import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) {
        try {
            File inFile = new File("D:\\CG\\_Modul-2\\src\\textFile\\copyText\\demo.text");
            FileWriter outFile = new FileWriter("D:\\CG\\_Modul-2\\src\\textFile\\copyText\\newdemo.text");
            if (!inFile.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(inFile));
            String line;
            while ((line = br.readLine()) != null) {
                outFile.write(line+"\n");
            }
            br.close();
            outFile.close();
        }catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

}
