public class Main {
    public static void main(String[] args) {
        System.out.print("\n");
        testMyArrayList();
        testMyHashMap();
        testMyLinkedList();
        testMyStack();
    }

    public static void testMyArrayList() {
        MyArrayList<Integer> list = new MyArrayList<>();

        // Test add() and size()
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList size after adding elements: " + list.size()); // Output: 3

        // Test get()
        System.out.println("Element at index 1: " + list.get(1)); // Output: 20

        // Test set()
        list.set(2, 40);
        System.out.println("Updated element at index 2: " + list.get(2)); // Output: 40

        // Test remove()
        boolean removed = list.remove(0);
        System.out.println("ArrayList size after removing an element: " + list.size()); // Output: 2
        System.out.println("Removed element at index 0: " + removed); // Output: true

        // Test toString()
        System.out.println("ArrayList contents: " + list.toString()); // Output: [ 20, 40 ]

        // New line
        System.out.print("\n");
    }

    public static void testMyHashMap() {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        // Test put() and size()
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("HashMap size after adding entries: " + map.size()); // Output: 3

        // Test get()
        System.out.println("Value for key 'two': " + map.get("two")); // Output: 2

        // Test remove()
        boolean removed = map.remove("two");
        System.out.println("HashMap size after removing an entry: " + map.size()); // Output: 2
        System.out.println("Removed element at key 'two': " + removed); // Output: true

        // Test toString()
        System.out.println("HashMap contents: " + map.toString());
        /*
         * Output:
         * {
         * [ "one" : 1 ]
         * [ "three" : 3 ]
         * }
         */

        // New line
        System.out.print("\n");
    }

    public static void testMyLinkedList() {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        // Test append() and size()
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        System.out.println("LinkedList size after appending elements: " + linkedList.size()); // Output: 3

        // Test prepend() and size()
        linkedList.prepend(5);
        System.out.println("LinkedList size after prepending an element: " + linkedList.size()); // Output: 4

        // Test get()
        System.out.println("Element at index 1: " + linkedList.get(1)); // Output: 10

        // Test insert()
        linkedList.insert(15, 2);
        System.out.println("LinkedList size after inserting an element at index 2: " + linkedList.size()); // Output: 5

        // Test remove() by value
        boolean removedByValue = linkedList.remove(Integer.valueOf(20));
        System.out.println("LinkedList size after removing an element by value: " + linkedList.size()); // Output: 4
        System.out.println("Element 20 removed: " + removedByValue); // Output: true

        // Test remove() by index
        Integer removedByIndex = linkedList.remove(2);
        System.out.println("LinkedList size after removing an element by index: " + linkedList.size()); // Output: 3
        System.out.println("Element removed at index 2: " + removedByIndex); // Output: 15

        // Test toString()
        System.out.println("LinkedList contents: " + linkedList.toString());
        // Output: [ 5 ] --> [ 10 ] --> [ 30 ]

        // New line
        System.out.print("\n");
    }

    public static void testMyStack() {
        MyStack<Integer> stack = new MyStack<>();

        // Test push() and size()
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack size after pushing elements: " + stack.size()); // Output: 3

        // Test peek()
        System.out.println("Top element in the stack: " + stack.peek()); // Output: 30

        // Test pop()
        Integer poppedElement = stack.pop();
        System.out.println("Popped element from the stack: " + poppedElement); // Output: 30
        System.out.println("Stack size after popping an element: " + stack.size()); // Output: 2

        // Test toString()
        System.out.println("Stack contents: " + stack.toString());
        // Output: [ 10 ] --> [ 20 ]

        // Test pop() when stack is empty
        stack.pop();
        stack.pop();
        System.out.println("Stack size after popping from an empty stack: " + stack.size()); // Output: 0
        System.out.println("Popped element from an empty stack: " + stack.pop()); // Output: null

        // New line
        System.out.print("\n");
    }
}
