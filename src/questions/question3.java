package questions;

/**
 * Created by Michael on 02-Jul-16.
 */
public class question3 {
    // not fully working doesnt print out highest prime
    public static void main(String[] args) {
        long num = 600851475143L;
        while (num != 1) {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                    num /= i;
                    break;
                }
            }
        }
    }
    /*
    public static LinkedList prime_Fact(int number){
        int divisor = 2;
        if (number == 1){
            return new LinkedList<>();
        }

        while (divisor<Math.sqrt(number)){
            if (number % divisor == 0){
                return
            }
        }

    }

    private static int primeFact(int number)

*/
}