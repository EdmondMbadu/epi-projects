public static short countBits(int x) {

    short count = 0;
    while (x != 0) {
        count += (short) (x & 1);
        x >>>= 1;
    }
    return count;
}

void main() {
    System.out.println("Hello World");
    System.out.println(countBits(15));
}
