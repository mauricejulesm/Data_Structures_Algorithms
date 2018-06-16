/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author Maurice
 */
public interface ITime {
    int getHour();
    int getMinutes();
    boolean isAm();
    
    boolean readTime(String inputTime);
    int subtractTime(ITime time);
    
}
