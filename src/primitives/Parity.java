package primitives;

public class Parity {

    public static short parity(long x) {
        short parity = 0;

        while (x != 0) {
            parity ^= (x & 1);
            x >>>= 1;
        }

        return parity;
    }

    void main() {

    }
}
