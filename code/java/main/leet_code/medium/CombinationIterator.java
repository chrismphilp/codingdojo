package leet_code.medium;

// TODO: Finish
public class CombinationIterator {

    String characters;
    char[] chars;
    int combinationLength;

    public CombinationIterator(String characters, int combinationLength) {
        this.characters = characters;
        this.combinationLength = combinationLength;

        chars = new char[combinationLength];
        for (int i = 0; i < combinationLength; i++) chars[i] = characters.charAt(i);
    }

    public String next() {
        return "";
    }

    public boolean hasNext() {
        if (combinationLength > characters.length()) return false;
        return true;
    }
}
