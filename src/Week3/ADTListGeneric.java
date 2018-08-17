/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

/**
 *
 * @author Jules Maurice
 */


public interface ADTListGeneric<E> {   
    int length();
    void createList();
    String printList();
    void insert(E e);
    void remove(E e);
    boolean find(E e);    
}
