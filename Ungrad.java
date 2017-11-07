import org.mongodb.morphia.annotations.Entity;

@Entity(value="Students")
public class Ungrad extends Student {
   private float fourth;
    private float fifth;
	
    
	
	
    /**
	 * @param fourth
	 * @param fifth
	 * @param entry
	 */
	public Ungrad(String name, String dpi, float math, float history, float spanish,float fourth, float fifth) {
		super(name,dpi,math,history,spanish);
		this.fourth = fourth;
		this.fifth = fifth;
	}



	/**
	 * 
	 */
	public Ungrad() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
    public float get_average() {
        return (float) ((float) (.60*((this.fourth + this.fifth)/2)) + ((this.history)*.40));
    }
    
}
