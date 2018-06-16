/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

/**
 *
 * @author Maurice
 */

/*
Given the total number of persons n and a number k which indicates that k-1 persons are skipped 
and kth person is killed in circle.The task is to choose the place in the initial circle so that 
you are the last one remaining and so survive.

For example, if n = 5 and k = 2, then the safe position is 3. Firstly, the person at position 2 is killed,
then person at position 4 is killed, then person at position 1 is killed. Finally, the person at position 5 is killed.
So the person at position 3 survives.
*/
public class JosephusProblem {
   static int josephus(int n, int k)
{
if (n == 1)
    return 1;
else
    /* The position returned by josephus(n - 1, k) 
    is adjusted because the recursive call 
    josephus(n - 1, k) considers the original 
    position k%n + 1 as position 1 
    
    */
    return (josephus(n - 1, k) + k-1) % n + 1;
}
 
// Driver Program to test above function
public static void main(String[] args)
{
int n = 14;
int k = 2;
System.out.println("Number of People: " + n);
System.out.println("People to skip: " + k);
System.out.println("The chosen(safe) place is: " + josephus(n, k));
} 
}
