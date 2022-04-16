package ss17_IO.baitap;


import java.io.Serializable;

class Product1 implements Serializable {


    public int id;
    public String name;
    public String hangX;
    public int cost;
    public String des;

    public Product1(){}

    public Product1(int id, String name, String hangX, int cost, String des  ) {
        this.id = id;
        this.name = name;
        this.hangX = hangX;
        this.cost = cost;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangX() {
        return hangX;
    }

    public void setHangX(String hangX) {
        this.hangX = hangX;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hangX='" + hangX + '\'' +
                ", cost=" + cost +
                ", des='" + des + '\'' +
                '}';
    }
}