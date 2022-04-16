package ss12_JavaCollectionFramework.baitap.UseArrayListAndLinkedList;

import java.util.*;

public class ProductManager extends Product {
    private static Scanner sc = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    public static void displayMenu() {

        int choice = -1;
        while (choice != 0) {
            System.out.println("----------Menu----------");
            System.out.println("1.\tAdd Product");
            System.out.println("2.\tEdit Product");
            System.out.println("3.\tDelete Product ");
            System.out.println("4.\tDisplay Product");
            System.out.println("5.\tSearch Product");
            System.out.println("6.\tSort Product");
            System.out.println("7.\tExit");
            System.out.println("---------------------------");
            System.out.println("Select choice :");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1: addProduct();
                break;
                case 2: editProduct();
                break;
                case 3: deleteProduct();
                break;
                case 4: displayProduct();
                break;
                case 5: searchProduct();
                break;
                case 6: sortProduct();
                break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }


    public static void sortProduct() {

        int choiceChildFunction = -1;
        while (choiceChildFunction != 0) {
            System.out.println("1.\tSort descending");
            System.out.println("2.\tSort up ascending");
            System.out.println("3.\tReturn main menu");
            System.out.println("---------------------------");
            System.out.println("Select choice :");
            Scanner sc = new Scanner(System.in);
            choiceChildFunction = sc.nextInt();
            switch (choiceChildFunction) {
                case 1:
                    sortDescending();
                    break;
                case 2:
                    sortAscending();
                    break;
                case 3:
                    displayMenu();

            }
        }
    }



    public static void addProduct() {

        System.out.println("Nhập id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập nameProduct:");
        String nameProduct = sc.nextLine();
        System.out.println("Nhập giá:");
        int cost = sc.nextInt();
        productList.add(new Product(id,nameProduct,cost));
    }

    public static void editProduct() {
        System.out.println("Nhập id cần sửa");
        int idEdit = sc.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idEdit) {
                sc.nextLine();
                System.out.println("Nhập nameProduct:");
                String nameProduct = sc.nextLine();
                System.out.println("Nhập giá:");
                int cost = sc.nextInt();
                productList.get(i).setNameProduct(nameProduct);
                productList.get(i).setCost(cost);
            }
        }
    }

    public static void deleteProduct() {
        System.out.println("Nhập id cần xóa");
        int idDelete = sc.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idDelete)
            {
                productList.remove(i);
            }
        }
    }

    public static void searchProduct() {

        System.out.println("Nhập name product cẩn tìm kiếm");
        String nameProduct = sc.nextLine();
        for (int i = 0; i < productList.size(); i++){
            if (nameProduct.equals(productList.get(i).getNameProduct()))
            {
                System.out.println(productList.get(i));
            }
        }
    }
    public static void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }

    }

    public static void sortAscending() {
        Comparator productComparator = new SortAscending();
        Collections.sort(productList, productComparator);
        System.out.println("ProductList đã sắp xếp xong");
    }

    private static void sortDescending() {
        Comparator productComparator = new SortDescending();
        Collections.sort(productList, productComparator);
        System.out.println("ProductList đã sắp xếp xong");
    }


    public static void main(String[] args) {
        displayMenu();
    }


}
