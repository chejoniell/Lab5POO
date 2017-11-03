/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimor;


public class HighSchoolStudentUnlinked extends Student {
    public float entry;
    public float first;
    public float second;
    public float third;
    public float apttitude;
    
    HighSchoolStudentUnlinked(){
        super();
        entry = 0;
        first = 0;
        second = 0;
        third = 0;
        apttitude = 0;
                
    }
    
    @Override
    public float get_average() {
        return (float) ((float) (.40*((this.first + this.second + this.third)/3)) + ((this.entry)*.60)) + (this.apttitude/2);
    }
    
}
