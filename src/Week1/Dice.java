package Week1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Maurice
 */
public class Dice extends ADice
{
    
    
     public int roll()
     {
        die1Value = randInt();
        die2Value = randInt();
        return die1Value + die2Value;
     }
    
     public void mapping()
     {
     }
   
     // implementing private random method
    public int randInt()
    {
        return 1+ (int)(Math.random()*5);
    }
    
}
