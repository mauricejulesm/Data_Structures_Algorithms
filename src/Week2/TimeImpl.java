/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.StringTokenizer;


public class TimeImpl implements ITime {
    private int hour;
    private int minute;
    private boolean am;

    @Override
    public int getHour() {
    return 0;
    }
    @Override
    public int getMinutes() {
    return 0;
    }
    @Override
    public boolean isAm() {
    return true;
    }
    @Override
    public boolean readTime(String inputTime) {
        StringTokenizer st = new StringTokenizer(inputTime, ": ");

    try {
        while (st.hasMoreElements()) {
            hour = Integer.parseInt((String)st.nextElement());
            minute = Integer.parseInt((String)st.nextElement());              
            if ((0 > getHour()) || (getHour() > 12) || 
                    (0 > getMinutes()) || (getMinutes() > 59)) {
                invalidate(); //   private method to set default values
                return false;
            }

            String ampm = (String) st.nextElement();
            if (ampm.equals("AM")) {
                am = true;
            } else if (ampm.equals("PM")) {
                am = false;
            } else {
                invalidate();
                return false;
            }
        }
    } catch (NumberFormatException e) {
        invalidate();
        return false;
    }
    return true;
    }
    @Override
    public int subtractTime(ITime t) {
    int hour24 = hour;
    if (!isAm()) {
        hour24 += 12;
    }

    ITime ta = (ITime) t;
    int taHour24 = ta.getHour();
    if (!ta.isAm()) {
        taHour24 += 12;
    }

    return (hour24 - ta.getHour()) * 60 + (this.minute - ta.getMinutes());
}
    
    private void invalidate(){
       hour = 00;
       minute = 00;
       am = true;
    }
}
