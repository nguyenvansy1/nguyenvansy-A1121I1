package ss12_JavaCollectionFramework.baitap.UseArrayListAndLinkedList;

import java.util.Comparator;

public class SortDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int a = o1.getCost() > o2.getCost() ? -1:1;
        return a;
    }
}