import java.io.*;
import java.util.*;
public class ISort {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(new File("src/input.txt"));
        while(scan.hasNext()){
            numbers.add(scan.nextInt());
        }
        int temp = 0;
        int it = 0;
        for(int i = 1; i <= numbers.size() - 1; i++){
            it = i - 1;
            while((it >= 0) && numbers.get(i) < numbers.get(it)){
                temp = numbers.get(i);
                numbers.set(i, numbers.get(it));
                numbers.set(it, temp);
                it--;
                i--;
            }
        }
        System.out.println(numbers);
    }
}
