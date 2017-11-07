

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public abstract class Student {
	 protected String name;
	 @Id private ObjectId id;
	    protected String dpi;
	    protected float math;
	    protected float history;
	    protected float spanish;
	    
	    Student(){
	        name = "";
	        dpi ="";
	        math = 0;
	        history = 0;
	        spanish = 0;
	               
	    }
	    Student(String name, String dpi, float math, float history, float spanish){
	    	this.name = name;
	    	this.dpi=dpi;
	    	this.math=math;
	    	this.history=history;
	    	this.spanish=spanish;
	    }
	    
	    public abstract float get_average();
	            
}
