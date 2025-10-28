package primitives;

public class ReverseBits {

    public static long reverseBits(long x) {

        for (int i = 0, j = 63; i < 32; i++, j--) {
            if (((x >> i) & 1) != ((x >> j) & 1)) {
                long bitMask = (1L << i) | (1L << j);
                x ^= bitMask;
            }
        }
        return x;
    }

    void main() {

        // these are signed bits, that is why the answer is weird
        System.out.println(reverseBits(11));
    }
}
