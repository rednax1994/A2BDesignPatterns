/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.Abstraction.Command;

/**
 *
 * @author xandergerreman
 */
public class SoundControl {
    Command slot;
    
    public SoundControl(){}
    
    public void setCommand(Command command){
        slot = command;
    }
    
    public void buttonWasPressed(){
        slot.execute();
    }
}
