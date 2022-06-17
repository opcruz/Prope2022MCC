
package homework.exercise5;

public class NumberUtils {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        boolean primeFlag = true;
        int i = 2;
        while (primeFlag && (i * i) <= number) {
            if (number % i == 0) {
                primeFlag = false;
            }
            i++;
        }
        return primeFlag;
    }

}
