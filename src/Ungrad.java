import org.mongodb.morphia.annotations.Entity;
/**
 * 
 * @author Grupo 5 
 * POO
 * Sección 21
 *Aspirante graduado de bachillerato
 */
@Entity(value="Aspirantes")
public class Ungrad extends Student {
   private float fourth;
    private float fifth;
	
    
	
	
    /**
     * COnstructor
	 * @param fourth
	 * @param fifth
	 * 
	 */
	public Ungrad(String name, String dpi, float math, float history, float spanish,float fourth, float fifth) {
		super(name,dpi,math,history,spanish);
		this.fourth = fourth;
		this.fifth = fifth;
	}



	/**
	 * COnstructor
	 */
	public Ungrad() {
		super();
		// TODO Auto-generated constructor stub
	}



	/* (non-Javadoc)
	 * @see Student#get_average()
	 */
	@Override
    public float get_average() {
        return (float) ((float) (.60*((this.fourth + this.fifth)/2)) + ((this.history)*.40));
    }
    
}
