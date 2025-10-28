package primitives;

public class SwapBits {

    public static long swapBits(long x, int i, int j) {

        long bitMastk = 0;
        // first check if the bits at i and j  are the same or different
        if (((x >>> i) & 1) != ((x >>> j) & 1)) {
            bitMastk = (1L << i) | (1L << j);
            x ^= bitMastk;
        }

        return x;


    }

    void main() {
        System.out.println(1L << 4);
    }
}
