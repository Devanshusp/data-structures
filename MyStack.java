public class MyStack<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyStack() {
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

    public void push(E value) {
        Node<E> newNode = new Node<E>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public E peek() {
        return tail.value;
    }

    public E pop() {
        if (size <= 0) {
            return null;
        }
        E value = tail.value;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node<E> node = head;
            while (node.next != null && node.next.next != null) {
                node = node.next;
            }
            node.next = null;
            tail = node;
        }
        size--;
        return value;
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
