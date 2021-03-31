package leet_code.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterTilePossibilities {
    public int numTilePossibilities(String tiles) {
        if (tiles.length() == 0) return 0;
        if (tiles.length() == 1) return 1;

        List<String> values = new ArrayList<>();
        for (int i = 0; i < tiles.length(); i++) {
            values.add(String.valueOf(tiles.charAt(i)));
        }

        Set<String> permutations = new HashSet<>();
        createPermutations("", values, permutations);
        return permutations.size();
    }

    private void createPermutations(String curr, List<String> remaining, Set<String> permutations) {
        for (int i = 0; i < remaining.size(); i++) {
            List<String> tmp = new ArrayList<>(remaining);
            String s = tmp.remove(i);
            String perm = curr.concat(s);
            permutations.add(perm);
            createPermutations(perm, tmp, permutations);
        }
    }
}
