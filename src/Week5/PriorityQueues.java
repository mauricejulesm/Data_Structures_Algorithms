/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

import java.util.*;

/**
 *
 * @author Maurice
 */
public class PriorityQueues {

    public static void main(String[] args) {
        /**
         * The elements of the priority queue are ordered according to their
         * natural ordering, or by a Comparator provided at queue construction
         * time, depending on which constructor is used.
         *
         * e.g: if you make a PriorityQueue of strings, they will be ordered
         * alphabetically
         */
        PriorityQueue<Integer> pQueueOfIntegers = new PriorityQueue<>();
        System.out.println("********** First Example ***********");
        pQueueOfIntegers.add(1);
        printStack(pQueueOfIntegers);

        pQueueOfIntegers.add(2);
        printStack(pQueueOfIntegers);

        pQueueOfIntegers.add(5);
        printStack(pQueueOfIntegers);

        pQueueOfIntegers.add(0);
        printStack(pQueueOfIntegers);
        pQueueOfIntegers.add(12);
        printStack(pQueueOfIntegers);

        pQueueOfIntegers.remove();
        printStack(pQueueOfIntegers);

//                System.out.println("I peeked: "+stack.peek());
//                System.out.println("I peeked: "+stack.peek());
        System.out.println("********** Second Example ***********");
        PriorityQueue<String> pQueueOfStrings
                = new PriorityQueue<String>();
        // Adding items to the pQueue
        pQueueOfStrings.add("C");
        pQueueOfStrings.add("C++");
        pQueueOfStrings.add("Java");
        pQueueOfStrings.add("Python");

        // Printing the most priority element
        System.out.println("Head value using peek function:"
                + pQueueOfStrings.peek());

        // Printing all elements
        System.out.println("The queue elements:");
        Iterator itr = pQueueOfStrings.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Removing the top priority element (or head) and
        // printing the modified pQueue
        pQueueOfStrings.poll();
        System.out.println("After removing an element"
                + "with poll function:");
        Iterator<String> itr2 = pQueueOfStrings.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        // Removing Java
        pQueueOfStrings.remove("Java");
        System.out.println("after removing Java with"
                + " remove function:");
        Iterator<String> itr3 = pQueueOfStrings.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        // Check if an element is present
        boolean b = pQueueOfStrings.contains("C");
        System.out.println("Priority queue contains C "
                + "or not?: " + b);

        // get objects from the queue in an array and
        // print the array
        Object[] arr = pQueueOfStrings.toArray();
        System.out.println("Value in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value: " + arr[i].toString());
        }
//        System.out.println("2%4 = "+1000%1000000000);
    }

    private static void printStack(PriorityQueue<Integer> s) {
        if (s.isEmpty()) {
            System.out.println("You have an empty stack");
        }
        System.out.printf("%s Top\n", s);
    }
}
