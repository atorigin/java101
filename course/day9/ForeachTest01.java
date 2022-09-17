package course.day9;

import java.util.*;

public class ForeachTest01 {
  
  public static void main(String[] args) {
    
    Map<Integer , String> map = new HashMap<Integer , String>();
  //Map<Integer , String> map = new TreeMap<Integer , String>();
    
    for (int i = 0; i < 6; i++) {
      map.put( i , "Teacher" + i );
    }
    for (String val : map.values()) {
      System.out.println(val);
    }

    System.out.println("\n1) 取得 Map 的 Values==========");
    Collection<String> c = map.values();
    for (String myvalue : c) {
        System.out.println(myvalue);
    }

    System.out.println("\n2)取得 Map 的 Keys==========");
    Set<Integer> k = map.keySet();
    for (Integer mykey : k) {
        System.out.println(mykey);
    }

    System.out.println("\n3)透過 Keys 取出 Value 做共同打印==========");
    Set<Integer> mykeys2 = map.keySet();
    for (Integer mykey2 : mykeys2) {
        System.out.println(mykey2 + "=" + map.get(mykey2));
    }

    System.out.println("\n4)toString 複習，在 Collection 和 Map 的類別都有 Override toString() 方法==========");
    System.out.println(map);
  }
}

/*HashMap
輸出結果：
   吳永志2
   吳永志4
   吳永志1
   吳永志3
   吳永志5
   吳永志0
*/
/*HTreeMap
輸出結果：
  吳永志0
  吳永志1
  吳永志2
  吳永志3
  吳永志4
  吳永志5
*/