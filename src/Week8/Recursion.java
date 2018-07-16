/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8;

/**
 *
 * @author Admin_M
 */
public class Recursion {

    public static void main(String[] args) {
        //System.out.println("Factorial of 10 = "+fact(0));

        System.out.println("*** Now Priting ***");
        desc(5);
        //System.out.println(power(2, 3));
    }

    public static void desc(int n) {
        if (n > 1) {
            desc(n - 1);
        }
        System.out.print(n+" ");
    }

    public static int power(int n, int m) {
        if (m == 0) {
            return 1;
        }
        return n * power(n, m - 1);
    }
}
