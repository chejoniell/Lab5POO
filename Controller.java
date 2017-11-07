import java.util.*;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;


public class Controller {
	

	   private List<Student> list;
	   private Datastore ds;
	   
	   public void connection() {
		  
	        MongoClient mongo = new MongoClient();
	        Morphia morphia = new Morphia();
	        morphia.map(Student.class).map(); // clases a guardar
	        ds = morphia.createDatastore(mongo, "Students"); // Base Datos
	   }
	   
	   public Controller(){
	       list = new ArrayList<Student>();
	   }
	   private void get_sorted_list(){
		   Query<Student> query = ds.createQuery(Student.class);
		   list =  query.asList();
	       Student student;
	       for (int i =0; i< this.list.size() -i; i++ ){
	           for (int j =1; j< this.list.size() -i; j++ ){
	            if (this.list.get(j-1).get_average() < this.list.get(j).get_average()){
	                student = this.list.get(j-1);
	                this.list.set(j - 1, this.list.get(j));
	                this.list.set(j, student);
	            }
	               
	           }
	       }
	   }
	  
	   private void add_student(Student student){
	       this.list.add(student);
	   }
	   
	   public String get_results(){
	       this.get_sorted_list();
	       String result= "Los resultados son :\n";
	       for (Student student: this.list){
	           result=result+"Nombre: " +student.name+ "|"+ " DPI: " + student.dpi + "|" + " Nota: " + student.get_average()+"\n";
	       }
	       return result;
	   }
	   
	   public void addHighSchoolStudent(String name, String dpi, float math, float history, float spanish, 
				float first, float second, float third){
	     HighSchoolStudent student = new HighSchoolStudent(name,dpi,math,history,spanish,first, second, third);
	      // this.add_student(student);
	       ds.save(student);
	       
	   }
	   
	   public void addHighSchoolStudentUnlinked(String name, String dpi, float math, float history, float spanish,
				float first, float second, float third, float apttitude){
	     HighSchoolStudentUnlinked student = new HighSchoolStudentUnlinked(name, dpi, math, history, spanish, first, second, third, apttitude);
	    //   this.add_student(student);
	       ds.save(student);
	   }
	   
	   public void addUngrad(String name, String dpi, float math, float history, float spanish,float fourth, float fifth) {
		 Ungrad student = new Ungrad(name, dpi, math, history, spanish, fourth, fifth);
	   //    this.add_student(student);
	       ds.save(student);
	   }
	   
	   public void addUnlinedUngrad(String name, String dpi, float math, float history, float spanish, float fourth, float fifth) {
		   UnlinedUngrad student = new UnlinedUngrad(name, dpi, math, history, spanish, fourth, fifth);
	      // this.add_student(student);
	       ds.save(student);
		   
	   }

	   public String verifica(float prom) {
		   
		   
		   return "";
	   }
	  
	   
	   
	  
	}
