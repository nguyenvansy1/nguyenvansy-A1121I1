package Test;

public abstract class MyAbstractList<String> implements MyList<String> {
    protected int size = 0;

    protected MyAbstractList() {

    }

    protected MyAbstractList(String[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    @Override
    public void add(String e) {
        add(size, e);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(String e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else {
            return false;
        }
    }
}