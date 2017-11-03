/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ebon1
 */

public class Controller {
    
   public ArrayList<Student> list;
private Scanner scanner;
private Scanner scanner2;
private Scanner scanner3;
private Scanner scanner4;
   
   Controller(){
       list = new ArrayList<Student>();
   }
   private void get_sorted_list(){
       float temp;
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
   
   public void get_results(){
       this.get_sorted_list();
       System.out.println("Los resultados son :");
       for (Student student: this.list){
           System.out.println("Nombre: " +student.name+ "|"+ " DPI: " + student.dpi + "|" + " Nota: " +String.valueOf(student.get_average()));
       }
   }
   
   public void addHighSchoolStudent(){
       scanner = new Scanner(System.in);
       HighSchoolStudent student = new HighSchoolStudent();
       System.out.println("Ingrese la informacion del estudiante recien graduado de secundaria");
       System.out.println("Ingrese el nombre");
       String input = scanner.nextLine();
       student.name = input;
       System.out.println("Ingrese el dpi");
       input = scanner.nextLine();
       student.dpi = input;
       System.out.println("Ingrese nota de primer anio");
       input = scanner.nextLine();
       student.first = Float.valueOf(input);
       System.out.println("Ingrese nota de segundo anio");
       input = scanner.nextLine();
       student.second = Float.valueOf(input);
       System.out.println("Ingrese nota de tercer anio");
       input = scanner.nextLine();
       student.third = Float.valueOf(input);
       System.out.println("Ingrese nota de examen de ingreso");
       input = scanner.nextLine();
       student.entry = Float.valueOf(input);
       
       this.add_student(student);
       
   }
   
   public void addHighSchoolStudentUnliked(){
       scanner2 = new Scanner(System.in);
       HighSchoolStudentUnlinked student = new HighSchoolStudentUnlinked();
       System.out.println("Ingrese la informacion del estudiante recien graduado de secundaria desvinculado");
       System.out.println("Ingrese el nombre");
       String input = scanner2.nextLine();
       student.name = input;
       System.out.println("Ingrese el dpi");
       input = scanner2.nextLine();
       student.dpi = input;
       System.out.println("Ingrese nota de primer anio");
       input = scanner2.nextLine();
       student.first = Float.valueOf(input);
       System.out.println("Ingrese nota de segundo anio");
       input = scanner2.nextLine();
       student.second = Float.valueOf(input);
       System.out.println("Ingrese nota de tercer anio");
       input = scanner2.nextLine();
       student.third = Float.valueOf(input);
       System.out.println("Ingrese nota de examen de ingreso");
       input = scanner2.nextLine();
       student.entry = Float.valueOf(input);
       System.out.println("Ingrese nota de examen de aptitud");
       input = scanner2.nextLine();
       student.apttitude = Float.valueOf(input);
       
       this.add_student(student);
       
   }
   
   public void addUngrad() {
	   scanner3 = new Scanner(System.in);
	   Ungrad student = new Ungrad();
	   System.out.println("Ingrese la informacion del estudiante recien graduado de bachillerato");
       System.out.println("Ingrese el nombre");
       String input = scanner3.nextLine();
       student.name = input;
       System.out.println("Ingrese el dpi");
       input = scanner3.nextLine();
       student.dpi = input;
       System.out.println("Ingrese nota de cuarto anio");
       input = scanner3.nextLine();
       student.fourth = Float.valueOf(input);
       System.out.println("Ingrese nota de quinto anio");
       input = scanner3.nextLine();
       student.fifth = Float.valueOf(input);
       System.out.println("Ingrese nota de examen de historia");
       input = scanner3.nextLine();
       student.history = Float.valueOf(input);
       
       this.add_student(student);
	   
   }
   
   public void addUnlinedUngrad() {
	   scanner4 = new Scanner(System.in);
	   Ungrad student = new Ungrad();
	   System.out.println("Ingrese la informacion del estudiante recien graduado de bachillerato desvinculado");
       System.out.println("Ingrese el nombre");
       String input = scanner4.nextLine();
       student.name = input;
       System.out.println("Ingrese el dpi");
       input = scanner4.nextLine();
       student.dpi = input;
       System.out.println("Ingrese nota de cuarto anio");
       input = scanner4.nextLine();
       student.fourth = Float.valueOf(input);
       System.out.println("Ingrese nota de quinto anio");
       input = scanner4.nextLine();
       student.fifth = Float.valueOf(input);
       System.out.println("Ingrese nota de examen de historia");
       input = scanner4.nextLine();
       student.history = Float.valueOf(input);
       
       this.add_student(student);
	   
   }

   
  
   
   
  
}
