/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.Abstraction;

import java.util.Date;

/**
 *
 * @author xandergerreman
 */
public abstract class TimeZone {

    String description = "timezone";

    public String getDescription() {
        return description;
    }

    public abstract Date dateNow();
}
