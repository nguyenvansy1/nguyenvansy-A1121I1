package Test;

public interface MyList<String> extends java.lang.Iterable<String> {
    public void add(String e);

    public void add(int index, String e);

    public void clear();

    public boolean contains(String e);

    public String get(int index);

    public int indexOf(String e);

    public boolean isEmpty();

    public int lastIndexOf(String e);

    public boolean remove(String e);

    public String remove(int index);

    public Object set(int index, String e);

    public int size();
}