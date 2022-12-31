package sem_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(4);
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("java");
        stringList.add("from");
        System.out.println(integerList);
        System.out.println(stringList);

        integerList = orderList(integerList);
        stringList = orderList(stringList);
        System.out.println(integerList);
        System.out.println(stringList);
    }

    //
//    static <T extends  Comparable<T>> void orderList(List<T> list) {
//        Collections.sort(list);
//    }
    private static <T extends Comparable<T>> List<T> orderList(List<T> list) {
        Collections.sort(list);
        return list;
    }


}
