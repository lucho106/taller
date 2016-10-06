/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class sucursal {
    private String ciudad;
private int numEmpleados;
private HashMap<String,Empleado>emp;

   public sucursal(String ciudad) {
        this.ciudad = ciudad;
        this.numEmpleados = 0;
        this.emp=new HashMap<>();}
   
   
   public boolean ingresarEmp (Empleado e){
       if(this.emp.containsKey(e))
           return false;
       else{
           this.emp.put(e.getCedula(),e);
           return true;
           
       }
       
   }
   
   public ArrayList<Empleado>listarTodosEmpleados(){
       ArrayList<Empleado>empleados= new ArrayList<>();
   for(Empleado e: this.emp.values())
       empleados.add(e);
   return empleados;
   }
   
   
 public Empleado listarEmpleadoMayor(){
     Empleado mayor= null;
     for(Empleado e: this.emp.values()){
         if (mayor==null)mayor=e;
         else
             if(e.getEdad()>mayor.getEdad())
                 mayor=e;
     }
         return mayor;
     }    
 
 
 public Empleado buscarEmpleado(String cedula){
     Empleado e = null;
     e=this.emp.get(cedula);
     return e;
 }
         
 











}
    

   
   
   

