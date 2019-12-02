package tsn_junit;

public class TSN_JUNIT {

    public static double myDiv(double a, double b) throws Exception {
        double c;
        c = a / b;
        if (!(Double.isNaN(c)) && (!Double.isInfinite(c))) {
            return c;

        } else {
            throw new Exception();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(myDiv(7,4));
    }

}
