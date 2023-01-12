import java.util.NoSuchElementException;

public interface Iterator<E> {
    boolean hasNext();
    E next();
}

public interface Collection<E> {
    Iterator<E> iterator();
    int size();
    E get(int index);
    void add(E item);
}

public class ArrayCollection<E> implements Collection<E> {
    private E[] items;
    private int size;

    public ArrayCollection(int capacity) {
        items = (E[]) new Object[capacity];
    }

    @Override
    public void add(E item) {
        if (size == items.length) {
            throw new IllegalStateException();
        }
        items[size++] = item;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return items[index];
    }

    private class ArrayIterator implements Iterator<E> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return items[index++];
        }
    }
}
