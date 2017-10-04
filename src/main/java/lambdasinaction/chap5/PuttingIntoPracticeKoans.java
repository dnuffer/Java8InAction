package lambdasinaction.chap5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class PuttingIntoPracticeKoans {
    final static Trader raoul = new Trader("Raoul", "Cambridge");
    final static Trader mario = new Trader("Mario", "Milan");
    final static Trader alan = new Trader("Alan", "Cambridge");
    final static Trader brian = new Trader("Brian", "Cambridge");

    final static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    @Test
    public void koan1() {
        // Koan 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> tr2011 = null; // transactions.stream()...
        assertThat(tr2011, equalTo(Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2011, 400))));
    }

    @Test
    public void koan2() {
        // Koan 2: What are all the unique cities where the traders work?
        List<String> cities = null; // transactions.stream()...
        assertThat(cities, equalTo(Arrays.asList("Cambridge", "Milan")));
    }

    @Test
    public void koan3() {
        // Koan 3: Find all traders from Cambridge and sort them by name.
        List<Trader> traders = null; // transactions.stream()...
        assertThat(traders, equalTo(Arrays.asList(alan, brian, raoul)));
    }

    @Test
    public void koan4() {
        // Koan 4: Return a string of all traders’ names sorted alphabetically.
        String traderStr = null; // transactions.stream()...
        assertThat(traderStr, equalTo("AlanBrianMarioRaoul"));
    }

    @Test
    public void koan5() {
        // Koan 5: Are there any trader based in Milan?
        boolean milanBased = false; // transactions.stream()...
        assertThat(milanBased, equalTo(true));
    }

    @Test
    public void koan6() {
        // Koan 6: What's the highest value in all the transactions?
        int highestValue = 0; // transactions.stream()...
        assertThat(highestValue, equalTo(1000));
    }
}