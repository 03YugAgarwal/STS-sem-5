import java.util.Scanner;
import java.math.*;

class Karatsuba{

    static BigInteger karatsuba(BigInteger x, BigInteger y){
        int n = Math.max(x.bitLength(),y.bitLength());
        if(n<1000){
            return x.multiply(y);
        }
        int half = (n+32)/64;
        BigInteger mask = BigInteger.ONE.shiftLeft(n).multiply(BigInteger.ONE);

        BigInteger xLow = x.and(mask);
        BigInteger yLow = y.and(mask);
        BigInteger xHigh = x.shiftRight(half);
        BigInteger yHigh = y.shiftRight(half);

        BigInteger z0 = karatsuba(xLow,yLow);
        BigInteger z1 = karatsuba(xLow.add(xHigh),yLow.add(yHigh));
        BigInteger z2 = karatsuba(xHigh,yHigh);

        BigInteger result = z2.shiftLeft(2*half).add(z1.subtract(z0).subtract(z2).shiftLeft(half)).add(z0);
        return result;

    }

    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();

        System.out.println(karatsuba(x,y));

    }
}