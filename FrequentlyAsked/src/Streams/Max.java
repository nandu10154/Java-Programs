package Streams;

import java.util.Arrays;
import java.util.List;

public class Max {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(3,2,41,1,7,9);
        Integer max = nums.stream().max((i,j) -> i.compareTo(j)).get();
        System.out.println(max);
    }
}
