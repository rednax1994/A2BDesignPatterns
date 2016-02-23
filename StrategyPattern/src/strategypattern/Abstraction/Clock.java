package strategypattern.Abstraction;

import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rebirth
 */
public interface Clock {

    public JPanel drawClock();

    public void setTimeZone(TimeZone timeZone);
}
