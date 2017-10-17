package main.java.mongo.controller;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;


/**
 * File -> Project Structure -> Project Settings -> Modules -> "Your Module Name" -> Sources -> Language Level
 * Java 8 Ayarı
 * stream() metodu ile elde edilen Stream nesnesi yapacağı işlemleri ardışıl olarak yaparken,
 * parallelStream() metoduyla elde edilen Stream nesnesi, bazı operasyonları paralel olarak koşturabilmektedir.
 */

public class java8example {

    public static void main(String args[]) {







        /**
         * Predicate
         * List names = Arrays.asList("Ali", "Veli", "Ömer", "Alper", "Semih", "Erkan");
           Stream stream = names.stream();
           String value = "Ömer";
         *   Predicate predicate=name->name.toString().length()>4;
         *   stream.filter(predicate).forEach(System.out::println);
         */


        /**
         * Sorted
         * Stream içerisindeki yığınsal verinin sıralanmış Stream nesnesini döndürür.
         *   stream.sorted().forEach(System.out::println);
         */


        /**
         * Range
         *
         *   LongStream range=LongStream.range(1,1000);
         */


        /**
         * Filter
         *
         *  stream.filter(s->!s.equals(value)).forEach(System.out::println);
         *  Object a=  stream.filter(degisken->!degisken.equals("Ömer")).collect(Collectors.toList());
         *  System.out.println(a);
         */

        /**
         * Foreach
         *
         *   Random random = new Random();
         *   random.ints().limit(10).forEach(System.out::println);
         */


        /**
         * Map,distinct
         * Bir Stream içerisinden tekrarlı veriler çıkarılmak isteniyorsa distinct metodundan faydalanılabilir.
         * Stream nesnesini isim uzunluğuna göre gruplar.

         *  List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
         *  List<Integer> namesList= numbers.stream().map(herhangi->herhangi*herhangi).distinct().collect(Collectors.toList());
         *  System.out.println(namesList.get(0));
         */


        /**
         * Collect join ..birleştirme
         *   - işareti ile birleştirme yapar
         *   String collect = (String) stream.collect(Collectors.joining(" - "));
         System.out.println(collect);
         */


        /**
         * Count alma
         *
         *  Long count= (Long) stream.collect(Collectors.counting());
         *  System.out.println(count);
         */


        /**
         * Map ile group lama yapmak



         Map<Integer,List> listMap= (Map<Integer, List>) stream.collect(Collectors.groupingBy(name->name.toString().length()));

         Iterator<Map.Entry<Integer, List>> entries = listMap.entrySet().iterator();

         while (entries.hasNext()) {
         Map.Entry<Integer, List> entry = entries.next();

         List<String> aa=entry.getValue();

         for(String aaa:aa){
         System.out.println(entry.getKey() +" : "+aaa);
         }


         }
         */


        /**
         * Lambda
         * Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde,
         * bir önceki adımda elde edilen sonuç bir sonraki adıma girdi olarak sunulmaktadır.
         * Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
         *
         *      int result = IntStream.of(1, 2, 3, 4, 5).reduce(0, (once, sonra) -> {
                System.out.format("%d - %d %n", once, sonra);
                return once + sonra;
                });

         // Lambda ile
                result = IntStream.of(1, 2, 3, 4, 5).reduce(1, (once, sonra) -> once * sonra);

         */

        /**
         * Thread ile lambda
         * new Thread(()->System.out.println("Lambda thread start")).start();

         */


        /**
         * Reduce
         * Önemli
         */





        /**
         * Parellel Stream
         *   List ints = Arrays.asList(1, 5, 3, 7, 11, 9, 15, 13);


         System.out.println("******Parellel stream start********");

         ints
         .parallelStream() // Paralel Stream
         .filter(Objects::nonNull) // null değilse
         .filter(n -> Integer.parseInt(n.toString()) > 0) // pozitif sayı ise
         .sorted() // sırala
         .forEach(System.out::println); // çıktıla


         System.out.println("*******Stream Start*************");

         ints
         .stream() // Paralel Stream
         .filter(Objects::nonNull) // null değilse
         .filter(n -> Integer.parseInt(n.toString()) > 0) // pozitif sayı ise
         .sorted() // sırala
         .forEach(System.out::println); // çıktıla

         *
         */


/**
 * Average
 * Arrays.stream(new int[] {1, 2, 3})
 .map(n -> 2 * n + 1) //3,5,7
 .average()
 .ifPresent(System.out::println);  // 5.0


 Stream.of("a1", "a2", "a3")
 .map(s -> s.substring(1))
 .mapToInt(Integer::parseInt)
 .max()
 .ifPresent(System.out::println);  // 3
 */




    }


}
