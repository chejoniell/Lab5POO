/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimor;


public class UnlinedUngrad extends Student {
    private float fourth;
    private float fifth;
    
    @Override
    public float get_average() {
        return (float) ((float) (.40*((this.fourth + this.fifth)/2)) + ((this.history)*.60));
    }
    
}
