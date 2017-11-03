/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimor;

/**
 *
 * @author ebon1
 */
public abstract class Student {
    public String name;
    public String dpi;
    public float math;
    public float history;
    public float spanish;
    
    Student(){
        name = "";
        dpi ="";
        math = 0;
        history = 0;
        spanish = 0;
               
    }
    
    public abstract float get_average();
            
}