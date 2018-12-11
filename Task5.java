package homework.homeWork10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task5 {
    public void task5(){

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Elecronics", 200);
        hashMap.put("Computer and networks", 300);
        hashMap.put("Appliances", 50);
        hashMap.put("Construction and repair", 100);
        hashMap.put("A house and a garden", 80);
        hashMap.put("Auto and Moto", 223);
        hashMap.put("Beauty and Sport", 250);
        hashMap.put("Children and mothers", 120);
        hashMap.put("Work and office", 325);
        hashMap.put("Other", 0);

        System.out.println("Task #5.1");
        print(hashMap);
        List list = new ArrayList(hashMap.entrySet());
        list.sort(Comparator.comparing(Object::hashCode));
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        print(list);

        System.out.println("Task #5.2");
        int maxCategory = 0;
        for (Integer element: hashMap.values()) {
            if (element>maxCategory){
                maxCategory = element;
            }
        }
        print("Max element in map categories: ", maxCategory);


        System.out.println("Task #5.3");
//        for (Integer elem: hashMap.values()){
//            if (elem==0) {
//                //                hashMap.remove("Other");
//                //                hashMap.remove("Other", 0);
//                hashMap.remove(hashMap.containsKey(elem));
//            }
//        }
        Iterator<HashMap.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            HashMap.Entry<String, Integer> temp = iterator.next();
                Integer intVal = temp.getValue();
                if (intVal==0){
                    String strKey = temp.getKey();
                    hashMap.remove(strKey);
                }
        }
        print(hashMap);
    }

    public void print(List list){
        for (Object o: list) {
            System.out.println(o);
        }
    }
    public void print(String str, int value){
            System.out.println(str + value);
    }

    public void print(Map<String, Integer> map){
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
