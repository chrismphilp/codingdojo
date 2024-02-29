package leet_code.medium;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class InvalidTransactionsTest {

    private InvalidTransactions underTest;

    @Before
    public void setup() {
        underTest = new InvalidTransactions();
    }

    @Test
    public void should_find_correct_invalid_transactions() {
        assertEquals(List.of("alice,20,800,mtv", "alice,50,100,beijing"), underTest.invalidTransactions(new String[]{"alice,20,800,mtv", "alice,50,100,beijing"}));
        assertEquals(List.of("alice,50,1200,mtv"), underTest.invalidTransactions(new String[]{"alice,20,800,mtv", "alice,50,1200,mtv"}));
        assertEquals(List.of("bob,50,1200,mtv"), underTest.invalidTransactions(new String[]{"alice,20,800,mtv", "bob,50,1200,mtv"}));
    }
}