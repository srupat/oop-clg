import java.util.*;

public class collections {
    public static void main(String[] args) {
        // arraylist functions
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println("ArrayList elements: " + arr);

        System.out.println("Get element at index 2: " + arr.get(2));

        System.out.println("Set element to 3 at index 0");
        arr.set(0, 3);
        System.out.println("ArrayList elements after setting: " + arr);

        System.out.println("Remove element at index 1");
        arr.remove(1);
        System.out.println("ArrayList elements after removal: " + arr);

        System.out.println("Clear ArrayList");
        arr.clear();
        System.out.println("ArrayList size after clearing: " + arr.size());

        // map collection
        Map<String, Float> cgpa = new HashMap<>();
        System.out.println("\nPutting elements to hashmap");
        cgpa.put("Abheerav", 8.9f);
        cgpa.put("Arya", 8.7f);
        cgpa.put("Srujan", 8.8f);
        System.out.println("HashMap elements: " + cgpa);

        System.out.println("Getting value for key 'Srujan': " + cgpa.get("Srujan"));

        System.out.println("Checking if hashmap contains key 'Aaditya': " + cgpa.containsKey("Aaditya"));

        System.out.println("Getting key else putting 8 as default if not present: " + cgpa.getOrDefault("Abheerav", 8.0f));

        System.out.println("Put if absent");
        cgpa.putIfAbsent("Aarya", 9.2f);
        System.out.println("HashMap elements after put if absent: " + cgpa);

        // set collection
        Set<Integer> intset = new TreeSet<>();
        System.out.println("\nAdd to integer set");
        intset.add(3);
        System.out.println("TreeSet elements after adding: " + intset);

        System.out.println("Clear set");
        intset.clear();
        System.out.println("TreeSet size after clearing: " + intset.size());

        System.out.println("Removing element 4");
        intset.remove(4); // 4 is not in the set, so nothing will be removed

        System.out.println("Getting the iterator for this set");
        var iter = intset.iterator();

        // vector collection
        Vector<Integer> stack = new Stack<>();
        System.out.println("\nAdding to stack");
        stack.add(3);
        System.out.println("Stack elements after adding: " + stack);

        System.out.println("Getting element at index 0: " + stack.get(0));

        System.out.println("Checking if stack contains element 3: " + stack.contains(3));

        // Index 2 doesn't exist, so attempting to remove it will cause an IndexOutOfBoundsException
        // So, let's remove the element at index 0
        System.out.println("Removing element at index 0");
        stack.remove(0);
        System.out.println("Stack elements after removal: " + stack);

        System.out.println("Check if stack is empty: " + stack.isEmpty());
    }
}
