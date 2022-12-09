
import java.util.LinkedList;

/**
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * <p>
 * a+(d*3) - истина
 * [a+(1*3) - ложь
 * [6+(3*3)] - истина
 * {a}[+]{(d*3)} - истина
 * <{a}+{(d*3)}> - истина
 * {a+]}{(d*3)} - ложь
 */
public class Home_work_3 {
    public static void main(String[] args) {
        String t1 = "a+(d*3)";
        String t2 = "[a+(1*3)";
        String t7 = "[a+(1*3){";
        String t3 = "[6+(3*3)]";
        String t4 = "{a}[+]{(d*3)}";
        String t5 = "<{a}+{(d*3)}>";
        String t6 = "{a+]}{(d*3)}";


        bracketSearch(t1);
        bracketSearch(t2);
        bracketSearch(t3);
        bracketSearch(t4);
        bracketSearch(t5);
        bracketSearch(t6);
        bracketSearch(t7);

    }


    public static void bracketSearch(String name) {

        char[] first = name.toCharArray();
        String[] ft1 = new String[]{"[", "]", "{", "}", "<", ">", "(", ")"};
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < ft1.length; j++) {
                if (ft1[j].equals(Character.toString(first[i]))) {
                    list.add(ft1[j]);
                }
            }
        }
        System.out.print(list);

        for (int i = 0; i < list.size();++i ) {

            for (int j = 1; j < list.size(); ++j) {


                if (list.get(i).equals("(") && list.get(j).equals(")")) {
                    list.remove(j);
                    list.remove(i);

                    i = 0;

                    break;
                } else if (list.get(i).equals("{") && list.get(j).equals("}")) {
                    list.remove(j);
                    list.remove(i);

                    i = 0;
                    break;
                } else if (list.get(i).equals("<") && list.get(j).equals(">")) {
                    list.remove(j);
                    list.remove(i);

                    i = 0;

                    break;
                } else if (list.get(i).equals("[") && list.get(j).equals("]")) {
                    list.remove(j);
                    list.remove(i);

                    i = 0;

                    break;
                }
                }
        }
        boolean result = false;
        if (list.isEmpty()) {
            result = true;
        }
        System.out.println(name + " " + " - " + list);
    }
}


