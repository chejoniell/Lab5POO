import java.util.*;
import org.mongodb.morphia.*;
import org.mongodb.morphia.query.Query;
import com.mongodb.MongoClient;
/**
 * 
 * @author Grupo 5 
 * POO
 * Sección 21
 *Controlador
 */

public class Controller {
	
		
	   private ArrayList<Student> list;
	   private Datastore ds;
	   /**
	    * Hace la conexión con Mongo
	    */
	   public void connection() {
		  
	        MongoClient mongo = new MongoClient();
	        Morphia morphia = new Morphia();
	        morphia.map(Student.class).map(HighSchoolStudent.class).map(Ungrad.class).map(HighSchoolStudentUnlinked.class).map(UnlinedUngrad.class); // clases a guardar
	        ds = morphia.createDatastore(mongo, "Aspirantes"); // Base Datos
	   }
	   /***
	    * Constructor
	    */
	   public Controller(){
	       list = new ArrayList<Student>();
	       
	   }
	   
			 /**
			  *   Saca los objetos de la base de datos y los ordena en la lista.
			  */
	   public void get_sorted_list(){   
		 list=new ArrayList<Student>();
		   Query<Student> query = ds.createQuery(Student.class);
		 int tempo =0;
		 List<Student> qq = query.asList();
		 for(Student k: qq) {
			 list.add(tempo, qq.get(tempo));
			 tempo++;
		 }
		 Student student;
		 for (int i =0; i< this.list.size(); i++ ){
	           for (int j =1; j< this.list.size(); j++ ){
	            if (this.list.get(j-1).get_average() < this.list.get(j).get_average()){
	                student = this.list.get(j-1);
	                this.list.set(j - 1, this.list.get(j));
	                this.list.set(j, student);
	            }
	            }
	           }
	   }
	   
	  
	   /**
	    * Añade el estudiante a la lista list.
	    * @param student
	    */
	   public void add_student(Student student){
	       this.list.add(student);
	   }
	   /**
	    * Hace un string con la lista de los aspirantes.
	    * @return Lista de los aspirantes
	    */
	   public String get_results(){
	       String result= "Los resultados son :\n";
	       for (Student student: this.list){
	           result=result+"Nombre: " +student.name+ "|"+ " DPI: " + student.dpi + "|" + " Nota: " + student.get_average()+"\n";
	       }
	       return result;
	   }
	   /**
	    * Añade un estudiante graduado de secundaria a la base de datos.
	    * @param name
	    * @param dpi
	    * @param math
	    * @param history
	    * @param spanish
	    * @param first
	    * @param second
	    * @param third
	    */
	   public void addHighSchoolStudent(String name, String dpi, float math, float history, float spanish, 
				float first, float second, float third){
	     Student student = new HighSchoolStudent(name,dpi,math,history,spanish,first, second, third);
	      // this.add_student(student);
	       ds.save((Student)student);
	       
	   }
	   /**
	    * Añade un estudiante desligado de secundaria a la base de datos.
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
	   public void addHighSchoolStudentUnlinked(String name, String dpi, float math, float history, float spanish,
				float first, float second, float third, float apttitude){
	     Student student = new HighSchoolStudentUnlinked(name, dpi, math, history, spanish, first, second, third, apttitude);
	    //   this.add_student(student);
	       ds.save((Student)student);
	   }
	   /**
	    * Añade un estudiante graduado de bachillerato a la base de datos.
	    * @param name
	    * @param dpi
	    * @param math
	    * @param history
	    * @param spanish
	    * @param fourth
	    * @param fifth
	    */
	   public void addUngrad(String name, String dpi, float math, float history, float spanish,float fourth, float fifth) {
		 Student student = new Ungrad(name, dpi, math, history, spanish, fourth, fifth);
	   //    this.add_student(student);
	       ds.save((Student)student);
	   }
	   /**
	    * Añade un estudiante desligado de secundaria a la base de datos.
	    * @param name
	    * @param dpi
	    * @param math
	    * @param history
	    * @param spanish
	    * @param fourth
	    * @param fifth
	    */
	   public void addUnlinedUngrad(String name, String dpi, float math, float history, float spanish, float fourth, float fifth) {
		   Student student = new UnlinedUngrad(name, dpi, math, history, spanish, fourth, fifth);
	      // this.add_student(student);
	       ds.save((Student)student);
		   
	   }
/**
 * Verifica si los estudiantes desligados de secundaria superan el promedio ingresado.
 * @param prom
 * @return Si o no, según el resultado.
 */
	   public String verifica(float prom) {
		   float promedioTot = 0;
		   float sum=0;
		   int contador=0;
		   for(Student ss: list) {
			   if(ss instanceof HighSchoolStudentUnlinked) {
				   sum= sum + ss.get_average();
				   contador = contador +1;
			   }
		   }
		   promedioTot = sum/contador;
		   if(promedioTot>=prom) {
			   return "Si";
		   }
		   else {
			   return "No";
		   }
	   }
	  /**
	   * Verifica si la mitad de los aspirantes desligados de bach supera 80 de promedio.
	   * @return String con resultado
	   */
	   public String verFifty() {
		   float sum = 0;
		   float cont = 0;
		   float prom=0;
		   for(Student ss: list) {
			   if(ss instanceof UnlinedUngrad) {
				   sum=sum+ss.get_average();
				   cont++;
			   }
		   }
		   sum=sum/2;
		   cont=cont/2;
		   prom = sum/cont;
		   if(prom>=80) {
			   return "El 50% de aspirantes desvinculados de bach. supera 80.";
		   }
		   else {
			   return "El 50% de aspirantes desvinculados de bach. no supera 80.";
		   }
	   }
	   
	   
	  
	}
