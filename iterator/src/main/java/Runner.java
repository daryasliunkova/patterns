import java.util.BitSet;

public class Runner {
    public static void main(String[] args) {
        BitSet bitset = new BitSet();
        bitset.set(1);
        bitset.set(19);
        bitset.set(20);
        bitset.set(47);
        BitSetIterator iter = new BitSetIterator(bitset);
        while (iter.hasNext()) {
            Boolean b = iter.next();
            String tf = (b.booleanValue() ? "T" : "F");
            System.out.print(tf);
        }
        System.out.println();
    }
}
