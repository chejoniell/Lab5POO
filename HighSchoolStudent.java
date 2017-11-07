
import org.mongodb.morphia.annotations.Entity;



@Entity(value="Students")
public class HighSchoolStudent extends Student {
 
    private float first;
    private float second;
    private float third;
    
    HighSchoolStudent(){
        super();
  
        first = 0;
        second = 0;
        third = 0;
                
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
	 */
	public HighSchoolStudent(String name, String dpi, float math, float history, float spanish, 
			float first, float second, float third) {
		super(name, dpi, math, history, spanish);
		
		this.first = first;
		this.second = second;
		this.third = third;
	}


	@Override
    public float get_average() {
        return (float) ((float) (.60*((this.first + this.second + this.third)/3)) + (((history+spanish+history)/3)*.40));
    }

    
}
