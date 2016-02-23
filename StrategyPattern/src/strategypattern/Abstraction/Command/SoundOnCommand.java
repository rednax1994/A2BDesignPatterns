/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.Abstraction.Command;

import strategypattern.Control.ClockControl;

/**
 *
 * @author xandergerreman
 */
public class SoundOnCommand implements Command{

    ClockControl clockControl;
    
    public SoundOnCommand(ClockControl clockControl){
        this.clockControl = clockControl;
    }
    
    @Override
    public void execute() {
        clockControl.Tick();
    }
    
}
