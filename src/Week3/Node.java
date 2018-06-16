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
public class Node<E>{
    E data;
    Node<E> next;
    
    Node(E e){
        this.data = e;
        this.next = null;
    }
}
