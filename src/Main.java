public static short countBits
        (int x) {
    short count = 0;
    while (x != 0) {
        count += (short) (x & 1);
        x >>>= 1;
    }

    return count;
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println(countBits(4));

}
