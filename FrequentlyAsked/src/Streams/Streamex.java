package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streamex {
    public static void main(String[] args) {
//        int [] numbers = {1,2,3,4,5,6,7,8,9};
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
//       print the even number
        List<Integer> even = numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(even);
//        print the square of each number
        List<Integer> square = numbers.stream().map(e-> e*e).collect(Collectors.toList());
        System.out.println(square);

//        print the sum of square
        int sumofsquare = numbers.stream().mapToInt(e->e*e).sum();
        System.out.println(sumofsquare);


        List<Integer> unsorted = Arrays.asList(7,4,1,2,6,9,0);
        System.out.println(unsorted);
        int sums = unsorted.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum using method "+sums);
//        reduce
        int sum = unsorted.stream().reduce((a,b) ->a+b).get();
        System.out.println("Sum using reduce " + sum);
        //        sort using java 8
        List<Integer> sorted = unsorted.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        System.out.println("double the numbers");
        List<Integer> d = unsorted.stream().map(e->e*2).collect(Collectors.toList());
        System.out.println(d);

//        distinct elements
        List<Integer> dup = Arrays.asList(1,1,2,3,4,4,5,6,8);
        List<Integer> distinct = dup.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct elements "+distinct);

//        Group by string having equal length
        List<String> words = Arrays.asList("apple","banana","cherry","date","grape");
        Map<Integer,List<String>> groups = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groups);

//        Remove String elemets from list where string contains an

        List<String> rm = words.stream().filter(e->!e.contains("an")).collect(Collectors.toList());
        System.out.println(rm);
// join the string seperated by ,
        String join = words.stream().collect(Collectors.joining(","));
        System.out.println(join);

// print the count of the strings which are having length greater than 5

        System.out.println("print the count of the strings which are having length greater than 5");
        List<String> strings = Arrays.asList("Welcome","to","my","family","dead","inside");
        int count = (int) strings.stream().filter(e->e.length()>5).count();
        List<String> ge = strings.stream().filter(e->e.length()>5).collect(Collectors.toList());
        System.out.println(ge);
        System.out.println(count);

//        usge of anymatch and all match
        List<Integer> intlist = Arrays.asList(1,2,3,4,5,6,7,8,9);
        boolean divisibleby2 = intlist.stream().allMatch(e->e%2 == 0);
        System.out.println("all the numbers are  divisible by 2 " +divisibleby2);
        boolean any = intlist.stream().anyMatch(e->e%2==0);
        System.out.println("any one of number is divisible by 2 " + any);
// count the each charecter

        String s = "Nandu";
        s = s.toLowerCase();
        Map<String,Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(map);
        Map<String,Long> map1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(e->e,Collectors.counting()));


    }
}
