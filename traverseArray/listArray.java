import java.util.*;

public class listArray {
  public static void main(String[] args) {
    String[] arr = new String[]{"a","b","c"};
     List arrList = Arrays.asList(arr);
     Iterator iterate = arrList.iterator();
     while (iterate.hasNext()) {
       System.out.println(iterate.next());
     }
  }
}
