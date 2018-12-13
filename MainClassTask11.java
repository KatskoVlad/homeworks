package homework.HomeWork11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MainClassTask11 {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Строка 1");
        list1.add("Строка X");
        list1.add("Строка Y");
        list1.add("Строка Z");
        list1.add("Строка 5");
        List<String> list2 = new LinkedList<>();
        list2.add("Строка 1");
        list2.add("Строка 2");
        list2.add("Строка 3");
        list2.add("Строка 4");
        list2.add("Строка 5");

        List<String> rezList = new LinkedList<>();

        Map<String, Integer> mapa1 = new HashMap<>();
        mapa1.put("Категория 1", 1);
        mapa1.put("Категория 1", 2);
        mapa1.put("Категория 1", 3);
        mapa1.put("Категория 2", 1);
        mapa1.put("Категория 2", 2);
        mapa1.put("Категория 2", 3);

        Map<String, Integer> mapa2 = new HashMap<>();
        mapa2.put("Категория 1", 1);
        mapa2.put("Категория 3", 2);
        mapa2.put("Категория 3", 3);
        mapa2.put("Категория 2", 1);
        mapa2.put("Категория 2", 2);
        mapa2.put("Категория 2", 3);
        Map<String, Integer> rezMap = new LinkedHashMap<>();

        Task11_1 task11_1 = new Task11_1();
        task11_1.utilList(list1, list2);
        rezList = task11_1.getTempList();
        task11_1.utilMap(mapa1, mapa2);
        rezMap = task11_1.getTempMap();

        rezList.forEach(rezult ->{
                if (!rezult.isEmpty()){
                System.out.println(rezult);
                } else { System.out.println("Intersection in lists not found!");
                }});
        rezMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
    }
}
