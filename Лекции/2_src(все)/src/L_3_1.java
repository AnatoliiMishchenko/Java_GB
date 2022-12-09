import java.util.*;

public class L_3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(22354);
//        int day = 29;
//        int month = 9;
//        int year = 1990;
        StringBuilder day = new StringBuilder("29");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[]{day, month, year};
//        Integer[] date = {day, month, year};
//        List<Integer> d = Arrays.asList(date);
        List<StringBuilder> d = Arrays.asList(date);
        // System.out.println(d);
        date[1] = new StringBuilder("09");
        //d.remove(year);
        System.out.println(d);
        LinkedList<Integer> n = new LinkedList<Integer>();
        n.add(1);
        n.add(3);
        System.out.println(n);
        n.removeFirst();
        System.out.println(n);
        Queue <Integer> tt = new LinkedList<Integer>();
        tt.add(2);
        tt.add(3);
        System.out.println(tt);
        int item = tt.remove();
        System.out.println(tt);


//        for (Object o : list
//        ) {
//            System.out.println(o);
//        }


        List<Integer> list1 = List.of(1, 12, 3, 14, 134, 12, 2);
        for (int trmp : list1
        ) {
            System.out.print(trmp);
        }

        Iterator<Integer> col = list1.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.out.println(col.next());


            // col.next();
            //


        }
    }
}
