import java.util.Arrays;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int initialCapacity) {
        this.elements = new Object[initialCapacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkForOutOfBounds(index);
        return (E) elements[index];
    }

    public void set(int index, E element) {
        checkForOutOfBounds(index);
        elements[index] = element;
    }

    public boolean remove(int index) {
        checkForOutOfBounds(index);
        int numToMove = size - (index + 1);
        if (numToMove > 0) {
            System.arraycopy(elements, index + 1, elements, index, numToMove);
        }
        elements[--size] = null;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length + (elements.length >> 1); // adding 50% capacity
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    private void checkForOutOfBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public String toString() {
        if (size == 0)
            return "[ ]";

        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i]).append(", ");
        }
        sb.append(elements[size - 1]).append(" ]");
        return sb.toString();
    }
}
