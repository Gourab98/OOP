package JAVAONE;

public class one {

    public static void main(String[] args) {
        int count = 0;
        int n = 13;
        while (count < 100) {
            if (Emirp(n)) {
                System.out.print(n + "\t");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            n++;
        }
    }
    
    public static boolean primeNumber(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean Emirp(int n) {
        return primeNumber(n) && primeNumber(reversal(n));
    }
    
    public static int reversal(int n) {
        if (n < 10) {
            return n;
        }
        return recursive(n % 10, n / 10);
    }
    
    public static int recursive(int a, int B) 
         {
        if (B < 1) {
            return a;
        }
        return recursive(a * 10 + B % 10, B / 10);
    }
}
