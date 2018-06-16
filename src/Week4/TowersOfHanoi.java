package Week4;

/**
 *
 * @author Maurice
 */
public class TowersOfHanoi {

    static int counter = 1;

    public static void main(String[] args) {

        move(4, "A", "B", "C");
    }
    public static void move(int n, String Beg, String Aux, String End) {
        if (n == 1) {
            System.out.println("Step " + counter + ": Move " + Beg + " to " + End);
            counter++;
        } else {
            move(n - 1, Beg, End, Aux);
            System.out.println("Step " + counter + ": Move " + Beg + " to " + End);
            counter++;
            move(n - 1, Aux, Beg, End);
        }
    }
}
