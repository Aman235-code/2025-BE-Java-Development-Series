import java.util.*;

public class Test {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        List<Integer> arr = new ArrayList<>();
        Map<String, Integer> marks = new HashMap<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.println(arr.get(i));
        // }

        marks.put("rahul",100);
        marks.put("simmy",200);

        for(Map.Entry<String, Integer> entry: marks.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("-----------------");
        }

        // List, Map, Set, ImmutableList,

        // optional 
        // System.out.println(marks.get("rohit")>10);

        Optional<Integer> marks1 = Optional.ofNullable((marks.get("rohit")));
        if (marks1.isPresent()) {
            
        }
        else{
            System.out.println("Not present");
        }

    }
}