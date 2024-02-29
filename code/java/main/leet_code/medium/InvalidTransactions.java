package leet_code.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvalidTransactions {

    public List<String> invalidTransactions(String[] transactions) {
        Map<String, List<Pair<String, Integer>>> mapOfTransactions = getMapOfTransactions(transactions);
        return findInvalidTransactions(transactions, mapOfTransactions);
    }

    private Map<String, List<Pair<String, Integer>>> getMapOfTransactions(String[] transactions) {
        Map<String, List<Pair<String, Integer>>> transactionMap = new HashMap<>();

        for (String transaction : transactions) {

            String[] vals = transaction.split(",");
            String name = vals[0];
            int time = Integer.parseInt(vals[1]);
            String city = vals[3];

            List<Pair<String, Integer>> pairs = transactionMap.getOrDefault(name, new ArrayList<>());
            pairs.add(new Pair<>(city, time));
            transactionMap.put(name, pairs);
        }
        return transactionMap;
    }

    private List<String> findInvalidTransactions(String[] transactions, Map<String, List<Pair<String, Integer>>> transactionMap) {
        List<String> res = new ArrayList<>();

        for (String transaction : transactions) {
            String[] vals = transaction.split(",");
            String name = vals[0];
            int time = Integer.parseInt(vals[1]);
            int amount = Integer.parseInt(vals[2]);
            String city = vals[3];

            if (amount > 1000) {
                res.add(transaction);
            } else {
                for (Pair<String, Integer> pair : transactionMap.get(name)) {
                    if (!pair.getFirst().equals(city) && Math.abs(time - pair.getSecond()) <= 60) {
                        res.add(transaction);
                        break;
                    }
                }
            }
        }
        return res;
    }
}
