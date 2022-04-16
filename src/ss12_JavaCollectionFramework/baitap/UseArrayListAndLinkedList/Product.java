package ss12_JavaCollectionFramework.baitap.UseArrayListAndLinkedList;

public class Product {
    private int id;
    private String nameProduct;
    private int cost;

    public Product() {}

    public Product(int id, String nameProduct,int cost){
        this.id = id;
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", cost='" + cost+ '\'' +
                '}';
    }
}
