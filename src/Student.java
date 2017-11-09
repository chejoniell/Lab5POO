
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
/**
 * 
 * @author Grupo 5 
 * POO
 * Sección 21
 *Clase madre para aspirantes
 */

@Entity("Aspirantes")
public abstract class Student{
	 protected String name;
	 @Id protected ObjectId id;
	    protected String dpi;
	    protected float math;
	    protected float history;
	    protected float spanish;
	    
	    /**
	     * Constructor
	     */
	    Student(){
	  }
	    
	    /**
	     * Constructor
	     * @param name
	     * @param dpi
	     * @param math
	     * @param history
	     * @param spanish
	     */
	    Student(String name, String dpi, float math, float history, float spanish){
	    	this.name = name;
	    	this.dpi=dpi;
	    	this.math=math;
	    	this.history=history;
	    	this.spanish=spanish;
	    }
	    
	    /**
	     * Método para cada clase hija que calculará su propio escalafón.
	     * @return escalafón
	     */
	    public float get_average() {
			// TODO Auto-generated method stub
			return 0;
		}
	            
}
