/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author Maurice
 */
public class TimeDemo {
    public static void main(String[] args) {
    int numberOfVisits = 0;
    int totalWaitingTime = 0;
    Scanner in = new Scanner(System.in);
    String answer;

    do {
    ITime arrivalTime = new TimeImpl();
    ITime seenByDoctor = new TimeImpl();
    int waitingTime;

    numberOfVisits++;
    System.out.print("Enter arrival time:");
    arrivalTime.readTime(in.nextLine());

    System.out.print("Enter time seen by doctor:");
    seenByDoctor.readTime(in.nextLine());

    waitingTime = seenByDoctor.subtractTime(arrivalTime);
    totalWaitingTime += waitingTime;
    System.out.print("Done? Enter 'Q' to quit, anything else to continue: ");
    answer = in.nextLine();
} while (!answer.equals("Q"));

    System.out.println("Number of visits: " + numberOfVisits);
    System.out.println("Total waiting time: " + totalWaitingTime + " minutes");
    System.out.println("Average waiting time: " + totalWaitingTime/numberOfVisits + " minutes");
}
}
