public class L_3 {
    public static void main(String[] args) {
        Object o = 1;
        System.out.println(summ(o, o));
        GetType(o);
        o = 1.2;
        System.out.println(summ(o, o));
        GetType(o);
        o = "34";
        System.out.println(summ(o, o));
        GetType(o);
        Integer a1 = 10;
        Double as = 12.12;
        System.out.println(summ(as, as));
        int[] a = new int[]{1, 2};
        int [] b = new int[3];
        System.arraycopy(a,0,b,0,a.length);
        for (int i: a
        ) {
            System.out.printf("%d",i);
        }
        System.out.println();
        for (int j: b
             ) {
            System.out.printf("%d",j);
        }
    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }

    static Object summ(Object obj, Object objR) {
        if (obj instanceof Double && objR instanceof Double) {
            return (Object) ((Double) obj + (Double) objR);
        } else if (obj instanceof Integer && objR instanceof Integer) {
            return (Object) ((Integer) obj + (Integer) objR);
        } else return 0;
    }
}
