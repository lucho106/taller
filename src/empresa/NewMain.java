/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Estudiante
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Empleado e1=new Empleado("123","v",0);
    Empleado e2=new Empleado("456","i",0);
    sucursal s = new sucursal("bogota");
    
   //ingresando empleado
    if(!s.ingresarEmp(e1)) System.out.println("error");
    if(!s.ingresarEmp(e2)) System.out.println("error");
    if(!s.ingresarEmp(e2)) System.out.println("error");
    
    Empleado e =s.buscarEmpleado("123");
    if(e!=null)  System.out.println(e);
    else System.out.println("no existe");
    }
    
}
