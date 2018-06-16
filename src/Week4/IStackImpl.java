/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

public class IStackImpl<T> implements IStack<T> {

    T t;
    int[] myQueue;
    int size = 5;

    @Override
    public T enqueue(T t) {

        return t;
    }
    //System.arraycopy(t, size, t, size, size)
    /**
     * @return
     */
    @Override
    public T dequeue() {
        if (myQueue.length <= 0) {
            System.out.println("The queue is full!");
        } else {
            myQueue[0] = 0;
        }
        return t;
    }

    @Override
    public boolean isEmpty() {
        return myQueue.length == 0;
    }

    /**
     * @return true
     */
    @Override
    public boolean isFull() {
        return myQueue.length >= size;
    }

    @Override
    public T poll() {
        // know the element at index [0] ( the nead)
        // remove the element from the array
        
        
        
        
        return t;
    }

    @Override
    public T element() {
        return t;
    }

}
