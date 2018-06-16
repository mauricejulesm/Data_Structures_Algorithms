/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.ArrayList;

public class ADTListImpl implements ADTList {

    static ADTListImpl ls = new ADTListImpl();
ArrayList<Boolean> l = new ArrayList<Boolean>();

    private String[] myStrings;
    private final int CAPACITY = 10;
    private static int length = 0;

    @Override
    public int length() {
        return length;
        
    }

    @Override
    public void createList() {
        myStrings = new String[CAPACITY];
    }

    @Override
    public void printList() {
        for (int i = 0; i < length; i++) {
            System.out.println(myStrings[i]);
        }
    }

    @Override
    public void insert(String s) {
        if (length < CAPACITY) {
            myStrings[length] = s;
            length++;
        } else {
            System.out.println("The list is full");
        }
    }

    public void insertAt(String s, int index) {

        if (length < CAPACITY) {
            for (int i = length - 1; i >= index; i--) {
                myStrings[i + 1] = myStrings[i];
                if(i == index){
                    myStrings[index] = s;
                }
            }
            length++;
        } else {
            System.out.println("The list is full");
        }
    }

    @Override
    public void remove(String s) {

    }

    @Override
    public boolean find(String s) {
        return true;
    }

    public static void main(String[] args) {
        ls.createList();
        ls.insert("one");
        ls.insert("two");
        ls.insert("three");
        ls.insert("four");
        ls.insert("five");
        

        ls.printList();
        System.out.println("Now length is: " + length);

        ls.insertAt("new", 3);
        System.out.println("After insterting at index");
        ls.printList();
    }

}
