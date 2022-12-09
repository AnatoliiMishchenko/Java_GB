import java.util.*;

/**
 *
 */
public class Sem_4_4 {
    public static void main(String[] args) {
        String [] name = {"one","two","three","four","five"};
        Queue<String> qlist = new LinkedList<String>(Arrays.asList(name));
        Deque<String> dlist = new ArrayDeque<String>(Arrays.asList(name));

      while (!qlist.isEmpty()){
            System.out.print(qlist.poll() + " ");
        }
        System.out.println();
        while (!dlist.isEmpty()){
            System.out.print(dlist.pollLast() + " ");
        }

    }
}
