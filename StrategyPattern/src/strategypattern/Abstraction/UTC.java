/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.Abstraction;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author xandergerreman
 */
public class UTC extends TimeZone {

    public UTC() {
        description = "UTC";
    }

    @Override
    public Date dateNow() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.getTime();
        return cal.getTime();
    }

}
