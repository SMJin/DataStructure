package recursion.greatestCommonDivisor;

public class Main {
    public static int gcd_firstTry(int a, int b) {
        System.out.println("a: "+a+", b: "+b);
        int smallNumber = a;
        int bigNumber = b;
        if (a > b) {
            smallNumber = b;
            bigNumber = a;
        }
        if (bigNumber % smallNumber == 0) {
            return smallNumber;
        }
        return gcd_firstTry(smallNumber, bigNumber%smallNumber);
    }

    public static int EuclidGCD(int a, int b) {
        System.out.println("a: "+a+", b: "+b);
        if (b == 0)
            return a;
        else
            return EuclidGCD(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("최대공약수 재귀 문제 - 유클리드 호제법");
        System.out.println(EuclidGCD(8, 22));
        System.out.println(EuclidGCD(22, 8));
    }
}
