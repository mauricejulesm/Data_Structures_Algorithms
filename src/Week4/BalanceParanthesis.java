/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.Stack;

/**
 *
 * @author Maurice
 */
public class BalanceParanthesis {

    public static char[] token = {'[', ']', '{', '}', '(', ')'};
    
    public boolean isBalanced(String expression){
        Stack<Character> s = new Stack<>();
        for(char c: expression.toCharArray()){
            if(isOpenTerm(c)){
                s.push(c);
            }else{
                if(isCloseTerm(c)|| s.empty()){
                    s.pop();
                }
        }
        return s.empty();
    }
 return true;
}
     private boolean isOpenTerm(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isCloseTerm(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   
