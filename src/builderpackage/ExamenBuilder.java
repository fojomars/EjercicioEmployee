/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpackage;

/**
 *
 * @author fojomars
 */
public class ExamenBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeBuilder miBuilder = new EmployeeBuilder(789, "Juan");
        miBuilder.setNewMiddleName("Ramirez");
        
        Employee newEmployee = new EmployeeBuilder(456, "Maria")
            .setNewMiddleName("Perez")
            .setNewBirthDate(25)
            .setNewBirthMonth(12)
            .setNewBirthYear(1961)
            .createEmployee();
    }
    
}
