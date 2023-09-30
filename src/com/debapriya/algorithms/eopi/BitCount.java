package debapriya.algorithms.eopi;

public class BitCount {

    public short countBits(int x) {
        short numBits = 0;
        while (x != 0) {
            numBits += x & 1;
            x >>>= 1;
        }
        return numBits;
    }

    public static void main(String[] args) {
        int x = 193;
        System.out.println("Number of bits for " + x + " = " + new BitCount().countBits(x));
    }
}