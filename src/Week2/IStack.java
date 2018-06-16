/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author Admin_M
 */
public interface IStack {

    boolean empty();

    int peek();

    int pop();

    int push(int t);

    int search(int t);
}
