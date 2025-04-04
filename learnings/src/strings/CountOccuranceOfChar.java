package learnings.src.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccuranceOfChar {

    public static void main(String[] args) {
        String s = "rakrsdffdfer3ewqewqee3e3ekk";
        //int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(char cs : s.toCharArray()) {
            map.put(cs,map.getOrDefault(cs,0)+1);
        }

        //List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        //list.sort((a, b) -> b.getValue().compareTo(a.getValue()));  Descending order

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));
       // System.out.println(list.get(1).getKey() + " " + list.get(1).getValue());
        System.out.println(list);
    }
}
