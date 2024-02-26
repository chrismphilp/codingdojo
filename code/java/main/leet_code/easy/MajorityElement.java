package leet_code.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

  public int majorityElementSimple(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.compute(num, (k, v) -> v == null ? 1 : v + 1);
    }

    return map.entrySet().stream()
        .max(Entry.comparingByValue())
        .map(Entry::getKey)
        .orElse(0);
  }

  public int majorityElement(int[] nums) {
    int count = 0;
    int element = 0;

    for (int num : nums) {
      if (count == 0) {
        element = num;
        count++;
      } else if (element == num) {
        count++;
      } else {
        count--;
      }
    }
    return element;
  }
}
