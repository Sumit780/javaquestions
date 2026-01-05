
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//        List<Integer> filteredList =  list.stream().filter( f -> f%2 == 1).toList();
//        System.out.println(filteredList);

//        List<String> list= Arrays.asList("java", "spring", "boot");
//        List<String> filteredUpperCase = list.stream().map(String::toUpperCase).toList();
//
//        System.out.println(filteredUpperCase);

//        List<Integer> nums = Arrays.asList(5,12,18,7,20);
//        List<Integer> greater = nums.stream().filter(f -> f > 10).toList();
//        System.out.println(greater);

//        List<String> str = Arrays.asList("Apple", "Banana", "Avocado", "Mango");
//
//        List<String> strA = str.stream().filter(f -> f.startsWith("A")).findFirst().stream().toList();
//        System.out.println(strA);

//        List<Integer> number = Arrays.asList(4, 2, 9, 1, 5);
//        List<Integer> sort=  number.stream().sorted(Integer::compareTo).toList();
//        System.out.println(sort);

//        List<Integer> dubnum = Arrays.asList(1,2,3,2,4,3,5);
//
//        List<Integer> dublicates = dubnum.stream()
//                .distinct().toList();
//        System.out.println(dublicates);

//        List<Integer> list = Arrays.asList(10, 45, 23, 99, 5);
//
//        List<Integer> minMax = list.stream()
//                .sorted(Integer::compareTo).toList();
//
//        System.out.println(minMax.getFirst());
//        System.out.println(minMax.getLast());

//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        Integer sum = list.stream().reduce(0,Integer::sum);
//        System.out.println(sum);

        //Find all even numbers
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);
         List<Integer> evenum =  nums.stream().filter((x) -> x % 2 == 0).toList();
         System.out.println(evenum);

         //2️⃣ Convert list of strings to uppercase
        List<String> names = Arrays.asList("java", "spring", "api");
        List<String> UpName = names.stream().map(String::toUpperCase).toList();
        System.out.println(UpName);

        //3️⃣ Count elements greater than 10
        List<Integer> nums1= Arrays.asList(5,10,15,20,25);
        List<Integer> NewNum = nums1.stream().filter(x -> x > 10).toList();
        System.out.println(NewNum.stream().count());

        //4️⃣ Find first element starting with "A"
        List<String> words = Arrays.asList("Banana","Apple","Avocado","Mango");

        List<String> wordNew = words.stream().filter(w -> w.startsWith("A")).toList();

        System.out.println(wordNew.getFirst());

//        🟡 MEDIUM (Most Asked)
//        5️⃣ Remove duplicates and sort
        List<Integer> dubSub = Arrays.asList(4,5,2,4,1,2,3);

        List<Integer> newDubsub = dubSub.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(newDubsub);

        //6️⃣ Find frequency of each character
        String input = "aabbccdaa";

        Map<Character, Integer> frq = new HashMap<>();
        for( char c : input.toCharArray()){
            frq.put(c, frq.getOrDefault(c, 0) +1);
        }

        System.out.println(frq);

        List<String> words1 = Arrays.asList("Apple", "Avocado", "Banana");

        Map<Character, List<String>> map =
                words1.stream()
                        .collect(Collectors.groupingBy(w -> w.charAt(1)));

        System.out.println(map);





//        Stream<Integer> data = num.stream();
//

        //System.out.println(mapdata);
    }

}