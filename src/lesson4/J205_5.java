package lesson4;

import java.math.BigInteger;

public class J205_5 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(10);
        int a = 0;
        for(int i = 3; i < 102; i+=3){
         sum = sum.multiply(BigInteger.valueOf(i));
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
