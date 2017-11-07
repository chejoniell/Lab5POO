import org.mongodb.morphia.annotations.Entity;

@Entity(value="Students")
public class UnlinedUngrad extends Student {
	    private float fourth;
	    private float fifth;
	    
	    @Override
	    public float get_average() {
	        return (float) ((float) (.40*((this.fourth + this.fifth)/2)) + ((this.history)*.60));
	    }

		/**
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
		 * 
		 */
		public UnlinedUngrad() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param name
		 * @param dpi
		 * @param math
		 * @param history
		 * @param spanish
		 */
		public UnlinedUngrad(String name, String dpi, float math, float history, float spanish) {
			super(name, dpi, math, history, spanish);
			// TODO Auto-generated constructor stub
		}
}
