import org.mongodb.morphia.annotations.Entity;

@Entity(value="Students")
public class HighSchoolStudentUnlinked extends Student {
    private float first;
    private float second;
    private float third;
    private float apttitude;
    
    HighSchoolStudentUnlinked(){
        super();
 
        first = 0;
        second = 0;
        third = 0;
        apttitude = 0;
                
    }
    
    
    /**
	 * @param name
	 * @param dpi
	 * @param math
	 * @param history
	 * @param spanish
	 * @param entry
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


	@Override
    public float get_average() {
        return (float) ((float) ((.40*((this.first + this.second + this.third)/3)) + (((history+spanish+math)/3)*.60)) + (this.apttitude))/2;
    }
    
}
