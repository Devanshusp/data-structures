public class Main {
    public static void main(String[] args) {
        System.out.print("\n");

        testMyArrayList();

        System.out.print("\n");

        testMyHashMap();

        System.out.print("\n");
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
        list.remove(0);
        System.out.println("ArrayList size after removing an element: " + list.size()); // Output: 2

        // Test toString()
        System.out.println("ArrayList contents: " + list.toString()); // Output: [ 20, 40 ]
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
        map.remove("two");
        System.out.println("HashMap size after removing an entry: " + map.size()); // Output: 2

        // Test toString()
        System.out.println("HashMap contents: " + map.toString());
        /*
         * Output:
         * {
         * [ "three" : 3 ]
         * [ "one" : 1 ]
         * }
         */
    }
}
