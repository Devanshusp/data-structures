public class MyQueue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyQueue() {
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

    public void enqueue(E value) {
        Node<E> newNode = new Node<E>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public E peek() {
        return head.value;
    }

    public E dequeue() {
        if (size <= 0)
            return null;

        if (head.equals(tail)) {
            tail = null;
        }
        E value = head.value;
        head = head.next;
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
