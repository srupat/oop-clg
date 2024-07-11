import java.util.*;

public class exam26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        String[] strings = myString.split("\\s+");
        for(String s : strings){
            if(map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }
            else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }




}
