package Simulation;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i=1;i<=n;i++) {
            if (i%15==0) {
                result.add("FizzBuzz"); // .add it insert a new value into the list
            } else if (i%3==0) {
                result.add("Fizz");
            } else if (i%5==0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i)); //convert interger to string
            }
        }
        return result;
    }
}
