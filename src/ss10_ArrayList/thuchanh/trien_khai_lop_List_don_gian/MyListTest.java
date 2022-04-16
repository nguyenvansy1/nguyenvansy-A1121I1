package ss10_ArrayList.thuchanh.trien_khai_lop_List_don_gian;

public class MyListTest {
    public static void main(String[] args) {

        MyList<String> listInteger = new MyList<String>();
        listInteger.add("Một");
        listInteger.add("Hai");
        listInteger.add("Ba");
        listInteger.add("Bốn");
        listInteger.add("Năm");

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
        listInteger.get(6);
        System.out.println("element 6: "+listInteger.get(6));


    }
}
