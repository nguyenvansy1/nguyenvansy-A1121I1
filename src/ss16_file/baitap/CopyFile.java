package ss16_file.baitap;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;


class CopyFile{
    String s;
    public void read(String path) {
        try {
            FileInputStream fin = new FileInputStream(path);
            System.out.println("Nội dung file :");
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            for (byte b : bytes)
                System.out.print((char) b);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String path) {
        try {
            FileWriter writer = new FileWriter(path);

            System.out.println();
            writer.write(  "So ki tu cua file: " + s.length());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFile readFile = new CopyFile();
        readFile.read("D:\\A1121I1-NguyenVanSy\\Module 2\\data1.txt");
        readFile.writeToFile("D:\\A1121I1-NguyenVanSy\\Module 2\\result.txt");
        readFile.read("D:\\A1121I1-NguyenVanSy\\Module 2\\result.txt");
    }
}
