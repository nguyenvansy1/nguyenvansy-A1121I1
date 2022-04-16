package ss17_IO.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileBinaryUtils {
    Scanner sc = new Scanner(System.in);
    public static List<Product1> product = new ArrayList<>();
    public void addProductList(String path) {

        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))) {
            System.out.println("Nhập id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập name product: ");
            String name = sc.nextLine();
            System.out.println("Nhập hãng X: ");
            String hangX = sc.nextLine();
            System.out.println("Nhập cost: ");
            int cost = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập mô tả: ");
            String des = sc.nextLine();
            Product1 product1 = new Product1(id,name,hangX,cost,des);
            product.add(product1);
            stream.writeObject(product);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product1> displayFile(String path) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Product1>) stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
