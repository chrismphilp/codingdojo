package leet_code.medium;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> store = new HashMap<>();

        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            int hash = Arrays.hashCode(word);
            store.putIfAbsent(hash, new ArrayList<>());
            store.get(hash).add(str);
        }
        return new ArrayList<>(store.values());
    }
}
