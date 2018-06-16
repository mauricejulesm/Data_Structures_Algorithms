/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin_M
 */
public class ListClass {

    static List<String> s = new ArrayList<>();

    public static void main(String[] args) {
        listMethod();
    }

    public static void listMethod() {
        s.add("Jules");
        s.add("Glasgow");
        s.add("Edinburgh");
        s.add("Aberdeen");
        s.add("Dundee");

        System.out.println(s);
        s.add(2, "Maurice");
        System.out.println(s);

        System.out.println(s.indexOf("Dundee"));
        String city = s.stream().filter(p -> p.startsWith("A")).findFirst().get();

        System.out.println(city);
    }
}
