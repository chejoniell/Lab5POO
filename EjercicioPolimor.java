/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimor;

import java.util.Scanner;

/**
 *
 * @author ebon1
 */
public class EjercicioPolimor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Render render = new Render();
        while (true){
            render.menu();
            System.out.println("Presione cualquier tecla para comenzar");
            String input = scanner.nextLine();
            HighSchoolStudent e1 = new HighSchoolStudent();
            HighSchoolStudentUnlinked e2 = new HighSchoolStudentUnlinked();
            Ungrad e3 = new Ungrad();
            UnlinedUngrad e4 = new UnlinedUngrad();
            
            //Student e3 = new Ungrad();
            //Student e4 = new UnlinedUngrad();
            Controller controller = new Controller();
            
                    
            /**
            e2.dpi = "123";
            e2.history = (float) 10.0;
            e2.math = (float) 15.0;
            e2.spanish = (float) 10.0;
            e2.name = "Mace";
            e2.apttitude = 10;
            e2.entry = 5;
            e2.first = 10;
            e2.second = 15;
            e2.third = 10;
            **/
                       
            controller.addHighSchoolStudent();
            controller.addHighSchoolStudentUnliked();
            controller.get_results();
            controller.addUngrad();
            controller.addUnlinedUngrad();
            
            
            
            
            
                
        }
                
    }
    
}
