/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author Jules Maurice
 */
public class StackDemo {

    public static void main(String[] args) {
        IStackImpl stackObj = new IStackImpl();

        //Empty method
        if (stackObj.empty()) {
            System.out.println("Empty: Is Empty!");
        } else {
            System.out.println("Empty: Not Empty");
        }

        // push
        stackObj.push(1);
        stackObj.push(2);
        stackObj.push(3);
        stackObj.push(4);
        stackObj.push(5);

        //peek
        System.out.println("Peek: Top item: " + stackObj.peek());

        //print the whole array
        System.out.println("\nThe whole array");
        stackObj.printTheArray();
        
        // search 
        System.out.println("Seaching (3): Item found at index : "+ stackObj.search(3));
        // pop
        stackObj.pop();
        
        //print the whole array
        System.out.println("Pop: After popping last item");
        stackObj.printTheArray();
    
    
    
     System.out.println("powerMethod "+ power(1.7, 3) );

    }
    
    //to the power method
   static double power(double base, int exponent) {
    if (exponent < 1) {
        return 1.0;
    } else {
        return power(base, exponent-1) * base;
    }


}
}


