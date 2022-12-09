import java.util.*;

public class Main {
    public static void main(String[] args) {

        long start = System.nanoTime();
        Deque<String> dr = new ArrayDeque<>();
        Queue <String> q =  new LinkedList<>();
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> ln = new LinkedList<>();
         String str = "";
        StringBuilder stb = new StringBuilder();

        for (int i = 0; i < 10_000; i++) {
             str+="Start";

        }
        long end = System.nanoTime();
        System.out.println("Строка = "+ (end - start));

        start = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {

            dr.add("Start");
        }
         end = System.nanoTime();
        System.out.println("Dq = " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {

            list.add("Start");
        }
        end = System.nanoTime();
        System.out.println("Arlist = " + (end - start));
        start = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {

            ln.add("Start");
        }
        end = System.nanoTime();
        System.out.println("LinkitList = " +(end - start));


        start = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {

            stb.append("Start");
        }
        end = System.nanoTime();
        System.out.println("String bilder = " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {

            q.add("Start");
        }
        end = System.nanoTime();
        System.out.println("Ques = " + (end - start));


    }
}
