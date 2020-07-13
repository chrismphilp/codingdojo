package interview;

import java.util.HashMap;
import java.util.Map;

public class MostCommonArrayElement<T> {
    public T findMostCommonArrayElement(T[] array) {
        T currentMax = null;
        int currentMaxCount = 0;
        Map<T, Integer> elementMap = new HashMap<>();
        for (T t : array) {
            if (elementMap.containsKey(t)) {
                int newValue = elementMap.get(t) + 1;
                if (newValue > currentMaxCount) {
                    currentMax = t;
                }
            } else {
                elementMap.put(t, 1);
            }
        }
        return currentMax;
    }
}
