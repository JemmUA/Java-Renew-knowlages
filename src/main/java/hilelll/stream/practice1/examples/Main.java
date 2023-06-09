package hilelll.stream.practice1.examples;

import java.io.IOException;


public class Main {

//    https://www.youtube.com/watch?v=t1-YZ6bF-g0
    public static void main(String[] args) throws IOException {
//        1. Integer Stream
//        IntStream
//                .range(1, 10)
//                .forEach(System.out::print);

        // 2. Integer stream with skip
//        IntStream
//                .range(1, 20)
//                .skip(11)
//                .forEach(System.out::println);

//        3. Integer stream with sum
//        System.out.println(
//                IntStream
//                        .range(1, 5)
//                        .sum()
//        );

//        4. Stream.of, sorted and find first
//        Stream.of("Ava", "Andrew", "Adam", "Alberto")
//                .sorted()
//                .findFirst()
//                .ifPresent(System.out::println);

//        5. Stream from Array, sort, filter and print
//        String[] names = {"Alex", "Bob", "James", "Hellen", "John", "Kate", "Jessy"};
//        Arrays.stream(names)  // same as Stream.of(names)
//                .filter(x->x.startsWith("J"))
//                .sorted()
//                .forEach(System.out::println);
        // 6. Average of squares of an int array
//        Arrays.stream(new int[]{2, 4, 6, 8})
//                .map(x -> x * x)
//                .average()
//                .ifPresent(System.out::println);


        // 7. Stream from List filter and print
//        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Alex", "Bob", "James", "Hellen", "John", "Kate", "Jessy");
//        people.stream()
//                .map(String::toLowerCase)
//                .filter(x->x.startsWith("a"))
//                .forEach(System.out::println);

        // 8.Stream rows from text file, sort, filter and print
//        Stream<String> bands = Files.lines(Paths.get("bands.txt"))
//                .sorted()
//                .filter(x -> x.length() > 12)
//                .forEach(System.out::println);
//        bands.close();

        // 9. Stream rows from text file and save to List
//        List<String> bands2 = Files.lines(Paths.get("bands"))
//                .filter(x->x.contains("jit"))
//                .collect(Collectors.toList());
//        bands2.forEach(x->System.out.println(x));

        // 10. Steam rows from CSV file and count
//        Stream<String> rows1 = Files.lines(Paths.get(data.txt));
//
//        int rowCount = (int) rows1
//                .map(x ->x.split (","))
//                .filter(x ->x.length == 3)
//                .count();
//        System.out.println(rowCount);
//        rows1.close();
//    }

        // 11. Stream rows from CSV file, parse data from rows
//        Stream<String> rows2 = Files.lines(Paths.get(data.txt));
//        rows2
//                .map(x ->x.split(","))
//                .filter(x -> x.length == 3)
//                .filter(x -> Integer.parseInt(x[1]) > 14)
//                .forEach(x -> System.out.println(x[0] + " " +x[1] + " " +x[2] + " "));

        // 12.  Stream rows from CSV file, store fields in HashMap
//        Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
//        Map<String, Integer> map = new HashMap<>();
//        map = rows3
//                .map(x -> x.split(","))
//                .filter(x -> x.length = 3)
//                .filter(x -> Integer.parseInt(x[1]) > 15)
//                .collect(Collectors.toMap(
//                        x -> x[0],
//                        x -> Integer.parseInt(x[1])));
//        rows3.close();
//        for (String key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
//        }

//        13. Reduction - sum
//        double total = Stream.of(7.3, 1.5, 4.8)
//                .reduce(0.0, (Double a, Double b) -> a + b);
//        System.out.println("Total = " + total);

//        14. Reduction = summary statistics
//        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
//                .summaryStatistics();
//        System.out.println(summary);




    }
}
