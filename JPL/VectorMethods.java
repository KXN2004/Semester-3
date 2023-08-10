/* Write a Java program to implement 15 methods of Vector class */
import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();
        // 1. add(Object o): Add an element to the end of the Vector
        vector.add("Hello");
        vector.add("World");
        // 2. size(): Get the number of elements in the Vector
        System.out.println("Vector size: " + vector.size());
        // 3. get(int index): Access an element at a specific index
        System.out.println("Element at index 0: " + vector.get(0));
        // 4. set(int index, Object element): Modify an element at a specific index
        vector.set(1, "Java");
        // 5. contains(Object o): Check if the Vector contains a specific element
        System.out.println("Vector contains 'Java': " + vector.contains("Java"));
        // 6. isEmpty(): Check if the Vector is empty
        System.out.println("Is the Vector empty? " + vector.isEmpty());
        // 7. indexOf(Object o): Get the index of the first occurrence of an element
        System.out.println("Index of 'Java': " + vector.indexOf("Java"));
        // 8. lastIndexOf(Object o): Get the index of the last occurrence of an element
        vector.add("Java");
        System.out.println("Last index of 'Java': " + vector.lastIndexOf("Java"));
        // 9. remove(Object o): Remove the first occurrence of an element
        vector.remove("Hello");
        System.out.println("Vector after removing 'Hello': " + vector);
        // 10. remove(int index): Remove the element at a specific index
        vector.remove(1);
        System.out.println("Vector after removing element at index 1: " + vector);
        // 11. clear(): Remove all elements from the Vector
        vector.clear();
        System.out.println("Vector after clearing all elements: " + vector);
        // 12. addAll(Collection<? extends E> c): Add all elements from another collection
        Vector<String> newElements = new Vector<>();
        newElements.add("New");
        newElements.add("Elements");
        vector.addAll(newElements);
        System.out.println("Vector after adding new elements: " + vector);
        // 14. capacity(): Get the current capacity of the Vector
        System.out.println("Current capacity: " + vector.capacity());
        // 14. ensureCapacity(int minCapacity): Ensure the Vector has at least the given capacity
        vector.ensureCapacity(10);
        System.out.println("Vector capacity after ensureCapacity: " + vector.capacity());
        // 15 trimToSize(): Trims the capacity of the Vector to its current size
         vector.trimToSize();
        System.out.println("Vector capacity after trimming: " + vector.capacity());
    }
}
