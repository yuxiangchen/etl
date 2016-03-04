import java.util.*;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {

       final Map<String, Integer> result = new HashMap<String, Integer>();
            for (Map.Entry<Integer, List<String>> e : old.entrySet()) {
                   for (String s : e.getValue()) {
                       result.put(s.toLowerCase(), e.getKey());
                   }
            }
       return result;
       // create map to store
//       Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
//
//       List <String> onePoint = new ArrayList<String>(Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T"));
//       List <String> twoPoint = new ArrayList<String>(Arrays.asList("D", "G"));
//       List <String> threePoint = new ArrayList<String>(Arrays.asList("B", "C", "M", "P"));
//       List <String> fourPoint = new ArrayList<String>(Arrays.asList("F", "H", "V", "W", "Y"));
//       List <String> fivePoint = new ArrayList<String>(Arrays.asList("K"));
//       List <String> eightPoint = new ArrayList<String>(Arrays.asList("J", "X"));
//       List <String> tenPoint = new ArrayList<String>(Arrays.asList("Q", "Z"));
//
//       // populate hash map
//       map.put(1,onePoint);
//       map.put(2,twoPoint);
//       map.put(3,threePoint);
//       map.put(4,fourPoint);
//       map.put(5,fivePoint);
//       map.put(8,eightPoint);
//       map.put(10,tenPoint);

//       for(Map.Entry<Integer, List<String>> entry : map.entrySet()){
//           Integer key = entry.getKey();
//           List<String> values = entry.getValue();
//           System.out.println("Key = " + key);
//           System.out.println("Values = " + values);
//       }


//       Map<String, Integer> transformmap = new HashMap<String, Integer>();

   }
}
