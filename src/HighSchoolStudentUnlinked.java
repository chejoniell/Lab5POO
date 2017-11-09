import org.mongodb.morphia.annotations.Entity;
/**
 * 
 * @author Grupo 5 
 * POO
 * Sección 21
 *Aspirante desligado de secundaria
 */
@Entity(value="Aspirantes")
public class HighSchoolStudentUnlinked extends Student {
    private float first;
    private float second;
    private float third;
    private float apttitude;
    
    /**
     * Constructor
     */
    HighSchoolStudentUnlinked(){
        super();
          
    }
    
    
    /**
	 * @param name
	 * @param dpi
	 * @param math
	 * @param history
	 * @param spanish
	 * @param first
	 * @param second
	 * @param third
	 * @param apttitude
	 */
	public HighSchoolStudentUnlinked(String name, String dpi, float math, float history, float spanish,
			float first, float second, float third, float apttitude) {
		super(name, dpi, math, history, spanish);

		this.first = first;
		this.second = second;
		this.third = third;
		this.apttitude = apttitude;
	}


	/* (non-Javadoc)
	 * @see Student#get_average()
	 */
	@Override
    public float get_average() {
        return (float) ((float) ((.40*((this.first + this.second + this.third)/3)) + (((history+spanish+math)/3)*.60)) + (this.apttitude))/2;
    }
    
}
