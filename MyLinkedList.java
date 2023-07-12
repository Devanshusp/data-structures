public class MyLinkedList<E> {
    private Node<E> head;
    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    private static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }
    }

    public int size() {
        return size;
    }

    public void append(E value) {
        Node<E> newNode = new Node<E>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        size++;
    }

    public void prepend(E value) {
        Node<E> newNode = new Node<E>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public E get(int index) {
        checkForOutOfBounds(index);
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }

    public void insert(E value, int index) {
        checkForOutOfBounds(index);
        if (index == 0) {
            this.prepend(value);
            return;
        } else if (index == size - 1) {
            this.append(value);
            return;
        }
        Node<E> newNode = new Node<E>(value);
        Node<E> node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    public boolean remove(E value) {
        if (head.value.equals(value)) {
            head = head.next;
            size--;
            return true;
        }
        Node<E> prev = head;
        Node<E> node = head.next;
        while (node != null) {
            if (node.value.equals(value)) {
                prev.next = node.next;
                size--;
                return true;
            }
            prev = node;
            node = node.next;
        }
        return false;
    }

    public E remove(int index) {
        checkForOutOfBounds(index);
        Node<E> prev = head;
        Node<E> node = head.next;
        if (index == 0) {
            head = head.next;
            size--;
            return prev.value;
        }
        for (int i = 1; i < index; i++) {
            prev = node;
            node = node.next;
        }
        prev.next = node.next;
        size--;
        return node.value;
    }

    private void checkForOutOfBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public String toString() {
        if (size == 0)
            return "[ ]";

        Node<E> node = head;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("[ ");
            sb.append(node.value);
            sb.append(" ]");
            if (node.next != null) {
                node = node.next;
                sb.append(" --> ");
            }
        }
        return sb.toString();
    }
}
