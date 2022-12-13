
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
        String t7 = "[6+(3*3)(]";
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
        System.out.println("+++++++");
        bracketS(t1);
        bracketS(t2);
        bracketS(t3);
        bracketS(t4);
        bracketS(t5);
        bracketS(t6);
        bracketS(t7);
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
        int t = 0;

        int e = list.size();

        boolean rez = false;

        for (int i = 0; i < list.size(); ++i) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals("(") && list.get(j).equals(")")) {
                    t += 2;
                    break;
                }
                if (list.get(i).equals("{") && list.get(j).equals("}")) {
                    t += 2;
                    break;
                }
                if (list.get(i).equals("[") && list.get(j).equals("]")) {
                    t += 2;
                    break;
                }
                if (list.get(i).equals("<") && list.get(j).equals(">")) {
                    t += 2;
                    break;
                }
            }
        }

        if (e - t == 0) {
            rez = true;
        }

        System.out.println(name + " " + " - " + rez);
    }

    public static void bracketS(String name) {

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

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); ++j) {
                if (list.get(i).equals("(") && list.get(j).equals(")")) {
                    list.remove(j);
                    list.remove(i);
                    i = -1;
                    break;
                } else if (list.get(i).equals("{") && list.get(j).equals("}")) {
                    list.remove(j);
                    list.remove(i);
                    i = -1;
                    break;
                } else if (list.get(i).equals("<") && list.get(j).equals(">")) {
                    list.remove(j);
                    list.remove(i);
                    i = -1;
                    break;
                } else if (list.get(i).equals("[") && list.get(j).equals("]")) {
                    list.remove(j);
                    list.remove(i);
                    i = -1;
                    break;
                }
            }
        }
        boolean result = false;
        if (list.isEmpty()) {
            result = true;
        }
        System.out.println(name + " " + " - " + result);
    }
}


