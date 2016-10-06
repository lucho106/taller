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
public class empresa {
public String nombre;

private HashMap<String,sucursal>suc;
   public empresa(String ciudad) {
        this.nombre =nombre;
        this.suc=new HashMap<>();}
   
   
public ArrayList<Empleado>listarTodosEmpleados(){
       ArrayList<Empleado>empleados= new ArrayList<>();
   for(sucursal s:this.suc.values()){
       for()
       { empleados.add(e);}}
   return empleados;
   }

public boolean ingresarEmp (sucursal s){
       if(this.emp.containsKey(s))
           return false;
       else{
           this.emp.put(s.getCedula(),s);
           return true;
           
       }
       
   }
   
    
}
