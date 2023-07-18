public class MyStack<E> {
    private Node<E> head;
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
        newNode.next = head;
        head = newNode;
        size++;
    }

    public E peek() {
        return head.value;
    }

    public E pop() {
        if (size <= 0)
            return null;

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
