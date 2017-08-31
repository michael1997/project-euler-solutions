package questions;

import java.util.ArrayList;

/**
 * Created by Michael on 02-Jul-16.
 */
public class question10 {

    public static void main(String[] args) {
        boolean prime;
        long sum = 2;
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 3; i<2000000; i+=2){

            prime = true;

            for(Integer k : primes){
                if (k > Math.sqrt(i)){
                    break;
                }
                if(i %k == 0){
                    prime = false;
                }
            }
            if (prime){
                primes.add(i);
                sum += i;

            }

        }
        System.out.println(sum);
    }
}
