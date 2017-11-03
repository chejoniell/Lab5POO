/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimor;


public class HighSchoolStudent extends Student {
    public float entry;
    public float first;
    public float second;
    public float third;
    
    HighSchoolStudent(){
        super();
        entry = 0;
        first = 0;
        second = 0;
        third = 0;
                
    }
    
    @Override
    public float get_average() {
        return (float) ((float) (.60*((this.first + this.second + this.third)/3)) + ((this.entry)*.40));
    }

    private void Super() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
