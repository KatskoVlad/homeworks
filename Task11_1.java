package homework.HomeWork11;

import sun.applet.resources.MsgAppletViewer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task11_1<T, K> {
    private List<T> tempList = new LinkedList<>();
    private Map<T, K> tempMap = new HashMap<>();
    // Найти пересечение двух списков
public void utilList(List<T> list1, List<T> list2){

    for (T elem : list1) {
        if (list2.contains(elem)){
            tempList.add(elem);
        }
    }
}

    public void utilMap(Map map1, Map map2){
        for (Object key : map1.keySet()) {
            if (map2.containsKey(key)){
                tempMap.put((T)key, (K) map1.get(key));
            }
        }
    }

    public List<T> getTempList() {
        return tempList;
    }

    public void setTempList(List<T> tempList) {
        this.tempList = tempList;
    }

    public Map<T, K> getTempMap() {
        return tempMap;
    }

    public void setTempMap(Map<T, K> tempMap) {
        this.tempMap = tempMap;
    }
}
