package az.caspian;

import java.util.BitSet;

public class BitSetDemo {
    private static final BitSet EMAIL_BIT_SET = new BitSet(64);

    static {
        EMAIL_BIT_SET.set(1);
        EMAIL_BIT_SET.set(2);
        EMAIL_BIT_SET.set(3);
        EMAIL_BIT_SET.set(4);
    }

    public static void main(String[] args) {
        System.out.println(EMAIL_BIT_SET.get("test1".hashCode()));
    }

    public static void checkInList() {

    }

    public static void isExist(String email) {
    }
}