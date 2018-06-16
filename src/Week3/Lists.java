/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Admin_M
 */
public class Lists {

    public static void main(String[] args) {
       // List<Integer> lse = Arrays.asList(1, 3, 4);

        LinkedList ls = new LinkedList();
        ls.add(1);
        ls.add("2");
        ls.add(3);
        ls.add(3);
        ls.add(4);
        System.out.println(ls);
        ls.add(ls.indexOf("2") + 1, "2.5");
        System.out.println(ls);

        System.out.println("**************************");
        ListIterator it = ls.listIterator(ls.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

    }
}
