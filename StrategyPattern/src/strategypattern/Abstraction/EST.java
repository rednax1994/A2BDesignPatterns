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
public class EST extends TimeZone {

    private final long HOUR = 3600 * 1000;
    private final int timeDiff = -5;
    TimeZone timeZone;

    public EST(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public String getDescription() {
        return timeZone.getDescription() + " " + timeDiff;
    }

    @Override
    public Date dateNow() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(timeZone.dateNow());
        cal.add(Calendar.HOUR_OF_DAY, timeDiff);
        cal.getTime();
        return cal.getTime();

    }
}
