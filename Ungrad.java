/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimor;


public class Ungrad extends Student {
    float fourth;
    float fifth;
	public Float entry;
    
    @Override
    public float get_average() {
        return (float) ((float) (.60*((this.fourth + this.fifth)/2)) + ((this.history)*.40));
    }
    
}
