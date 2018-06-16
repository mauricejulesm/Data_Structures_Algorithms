/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

/**
 *
 * @author Maurice
 * @param <T>
 */
public interface IStack <T>{

    /**
     *
     * @return
     */
    T enqueue( T t); // add an element to the tail of the queueu
    T dequeue(); // removes an element to the head of the queueu
    T poll(); // 
    T element (); //Retrieves, but does not remove, the head of this queue.
    boolean isEmpty(); // checks if the queue is empty
    boolean isFull();  // checks if the storate is full and doubles it if yes
}
