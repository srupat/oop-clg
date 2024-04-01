import java.util.*;

public class collections {
    public static void main(String[] args) {
        // arraylist functions
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        for(int i : arr){
            System.out.println(i);
        }
        int[] id = new int[5];
        arr.get(2);
        arr.set(0, 3);
        arr.remove(1);
        arr.clear();
        arr.size();

        // map collection
        Map<String, Float> cgpa = new HashMap<>();
        cgpa.put("Abheerav", 8.9f);
        cgpa.put("Arya", 8.7f);
        cgpa.put("Srujan", 8.8f);

        cgpa.get("Srujan");
        cgpa.containsKey("Aaditya");
        cgpa.getOrDefault("Abheerav", 8.0f);
        cgpa.putIfAbsent("Arya", 9.2f);

        // set collection
        Set<Integer> intset = new TreeSet<>();
        intset.add(3);
        intset.clear();
        intset.size();
        intset.remove(4);
        var iter = intset.iterator();

        // vector collection
        Vector<Integer> stack = new Stack<>();
        stack.add(3);
        stack.get(0);
        stack.contains(3);
        stack.remove(2);
        stack.isEmpty();
    }
}
