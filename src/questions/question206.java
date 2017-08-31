package questions;

import java.math.BigInteger;

/**
 * Created by Michael on 14-Jul-16.
 */
public class question206 {

    public static void main(String[] args){
        BigInteger start = BigInteger.valueOf(101010103L);
        boolean three = true;
        while (!testNumber(start.multiply(start) && start<)){
            if (three){
                start.add(BigInteger.valueOf(4));
                three = false;
            }
            else{
                start.add(BigInteger.valueOf(6));
                three = true;
            }
        }
        System.out.println(start);
    }

    private static boolean testNumber(BigInteger number){
        String string = number.toString();
        if(string.charAt(0) != 1){
            return false;
        }
        if(string.charAt(2) != 2){
            return false;
        }
        if(string.charAt(4) != 3){
            return false;
        }
        if(string.charAt(6) != 4){
            return false;
        }
        if(string.charAt(8) != 5){
            return false;
        }
        if(string.charAt(10) != 6){
            return false;
        }
        if(string.charAt(12) != 7){
            return false;
        }
        if(string.charAt(14) != 8){
            return false;
        }
        if(string.charAt(16) != 9){
            return false;
        }
        return true;
    }

}
