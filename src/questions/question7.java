package questions;

import java.util.ArrayList;

/**
 * Created by Michael on 02-Jul-16.
 */
public class question7 {

    public static void main(String[] args) {

        int num = 2;
        boolean prime;
        ArrayList<Integer> primes = new ArrayList<>();
        while (primes.size() < 10001){
            prime = true;
            for(Integer i : primes){
                if(num%i == 0){
                    prime = false;
                }
            }
            if (prime == true){
                primes.add(num);
            }
            num++;
        }
        System.out.println(primes.toString());
        System.out.println(primes.size());
        System.out.println(primes.get(10000));
    }

}
