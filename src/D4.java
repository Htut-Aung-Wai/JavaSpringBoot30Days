import java.util.*;

public class D4 {

 public static void main(String [] args) {
     List<String> Student = new ArrayList<>();
     Student.add("2");
     Student.add("1");
     Student.add("4");
     Student.add("3");
     Student.add("5");
     //Collections.sort(Student);
     System.out.println(Student);
     Set<String> StudentSet=new HashSet<>();
     StudentSet.add("2");
     StudentSet.add("1");
     StudentSet.add("4");
     StudentSet.add("3");
     StudentSet.add("5");
     System.out.println(StudentSet);
     Map<String, Integer> fruitCount = new HashMap<>();
     fruitCount.put("Apple", 3);
     fruitCount.put("Banana", 5);
     fruitCount.put("Orange", 2);
     System.out.println(fruitCount);



 }


}
