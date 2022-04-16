package ss10_ArrayList.baitap.ArrayList;

public class MyList<E> {
    public int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    public  E[] data = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList(){

    }

    public MyList(int capacity) {
        if (capacity>0)
        {
            data = (E[]) new Object[capacity];
        }
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public void add(int index , E element) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--)
        {
            data[i + 1] = data[i];
            data[index] = element;
            size++;
       }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public E remove(int index) {
        checkIndex(index);

        E e = data[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];

        data[size - 1] = null; // This element is now null

        // Decrement size
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return true;
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return i;
        return -1;
    }

    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }



}
