/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

/**
 *
 * @author Admin_M
 */
public interface ADTList {
    int length();
    void createList();
    void printList();
    void insert(String s);
    void remove(String s);
    boolean find(String s);
}
