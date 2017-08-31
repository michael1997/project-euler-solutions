package questions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

/**
 * Created by Michael on 14-Jul-16.
 */
public class question18 {

    public static void main(String[] args) throws IOException{
        ArrayList<ArrayList<Integer>> triangle = readTriangle("p67.txt");
        ArrayList<Integer> maxes = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int test1 = 0;
        int test2 = 0;
        maxes.add(triangle.get(0).get(0));

        System.out.println(maxes.toString());

        for(int i = 1; i < triangle.size(); i++){
            temp.clear();

            temp.add((maxes.get(0)) + (triangle.get(i).get(0)));
            for(int j = 1; j < i; j++){
                test1 = maxes.get(j-1)+triangle.get(i).get(j);
                test2 = maxes.get(j)+triangle.get(i).get(j);
                temp.add(Integer.max(test1,test2));
            }
            temp.add(maxes.get(i-1)+triangle.get(i).get(i));

            maxes.clear();
            maxes.addAll(temp);
            System.out.println(maxes.toString());
        }

        int biggest = 0;
        for(Integer k: maxes){
            if (biggest < k){
                biggest = k;
            }
        }

        System.out.println(biggest);
    }

    private static ArrayList<ArrayList<Integer>> readTriangle(String fileName) throws IOException{

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        try{
            new Scanner(new FileReader(fileName));
        }
        catch(FileNotFoundException e){
            throw new IOException("The file could not be found");
        }

        Scanner scanner = new Scanner(new FileReader(fileName));

        while (scanner.hasNextLine()){
            String[] line = scanner.nextLine().split(" ");
            ArrayList<Integer> numbers = new ArrayList<>();
            for (String i: line){
                numbers.add(Integer.parseInt(i));
            }
            result.add(numbers);
        }
        return result;
    }
}
