import org.mongodb.morphia.annotations.Entity;
/**
 * 
 * @author Grupo 5 
 * POO
 * Sección 21
 *Aspirantes Desligados de bachillerato
 */
@Entity(value="Aspirantes")
public class UnlinedUngrad extends Student {
	    private float fourth;
	    private float fifth;
	    
	    /* (non-Javadoc)
	     * @see Student#get_average()
	     */
	    @Override
	    public float get_average() {
	        return (float) ((float) (.40*((this.fourth + this.fifth)/2)) + ((this.history)*.60));
	    }

		/**
		 * Constructor
		 * @param name
		 * @param dpi
		 * @param math
		 * @param history
		 * @param spanish
		 * @param fourth
		 * @param fifth
		 */
	    
	    
		public UnlinedUngrad(String name, String dpi, float math, float history, float spanish, float fourth, float fifth) {
			super(name, dpi, math, history, spanish);
			this.fourth = fourth;
			this.fifth = fifth;
		}

		/**
		 * Constructor
		 */
		public UnlinedUngrad() {
			super();
			// TODO Auto-generated constructor stub
		}

		
}
