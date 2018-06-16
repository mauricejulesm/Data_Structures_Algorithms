/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

/**
 *
 * @author Maurice
 */
public abstract class ADice implements IDice{
    public int die1Value;
    public int die2Value;
    
    /**
     *
     * @return
     */
    @Override
    public int die1(){
        return die1Value;
    }

    /**
     *
     * @return
     */
    @Override
    public int die2(){
        return die2Value;
    }
    
    /**
     *
     * @return
     */
    @Override
    public abstract int roll();
    
}
