/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

/**
 *
 * @author Jules Maurice
 */
public class Factorial {
    public static void main(String[] args) {
        //System.out.println("Factorial of 10 = "+fact(0));
    fibo(10);
    
        System.out.println((9));
    }
    public static int fact(int n){
       if(n<=0){
           return 1;
       }else{
       return n*fact(n-1);
       }
    }
    
    public static void fibo(int n){
        if(n>0){
        int first = 1;
        int second = 1;
        System.out.println("Number 1 is: 1");
        System.out.println("Number 2 is: 1");
        for(int i = 3; i<=n; i++){
            int temp = first+second;
            System.out.println("Number "+i+" is: "+temp);
             first = second;
             second = temp;  
        }
        }else
            System.out.println("Use a number greater than "+n);
    }
    
    
    public static int fibo2(int n){
        if(n>=3){
            return fibo2(n-1) + fibo2(n-2); // recursive case
        }else
        return 1;   // base case
    }
}
