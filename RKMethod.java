import java.lang.Math;

/**
 * Calculates the values of k1, k2, k3, and  k4 to approximate
 * tempty with the RK-method of order 4 with h = 0.4.
 */
public class RKMethod {
    /**
     * Evaluates dydt = f(t, y).
     *
     * @param t the value of t
     * @param y the value of y
     *
     * @return dydt
     */
    public static double f(double t, double y) {
        double dydt;

        dydt = 1.0 / (72.0 * (Math.sqrt(y)) * (y - 8.0));

        return dydt;
    } // f

    /**
     * Evaluates the values of k1, k2, k3, k4, and y1.
     *
     * @param t the value of t
     * @param y the value of y
     * @param h the step size
     *
     * @return y1
     */
    public static double rk4(double t, double y, double h) {
        double k1, k2, k3, k4, y1;

        k1 = h * f(t, y);
        System.out.println("k1 = " + k1);
        k2 = h * f(t + (h / 2.0), y + (k1 / 2.0));
        System.out.println("k2 = " + k2);
        k3 = h * f(t + (h / 2.0), y + (k2 / 2.0));
        System.out.println("k3 = " + k3);
        k4 = h * f(t + h, y + k3);
        System.out.println("k4 = " + k4);
        y1 = y + ((1.0 / 6.0) * (k1 + (2.0 * k2) + (2.0 * k3) + k4));
        System.out.println("y1 = " + y1);

        return y1;
    } // rk4

    public static void main(String[] args) {
        double t = 0.0;
        double y = 4.0;
        double h = 0.4;

        while (y >= 0) {
            System.out.println("t = " + t);
            y = rk4(t, y, h);
            t = t + h;
            System.out.println("----------------------------------");
        } // while
    } // main

} // RKMethod
