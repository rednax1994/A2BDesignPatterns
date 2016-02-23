/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.Abstraction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import strategypattern.Presentation.AnalogClockPresentation;

/**
 *
 * @author rebirth
 */
public class AnalogClock implements Clock {

    private TimeZone timeZone = new UTC();

    @Override
    public JPanel drawClock() {
        AnalogClockPresentation panel = new AnalogClockPresentation();
        panel.setTime(systemClock());
        return panel;
    }

    private String systemClock() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(timeZone.dateNow());
    }

    @Override
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

}
