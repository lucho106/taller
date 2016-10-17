/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.*;

public class Empresa {
    
    private String nombre;
    private TreeMap<String,Sucursal> suc;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.suc = new TreeMap<>();
    }

    public String getNombre() {
        return nombre;
    }   
    
    public ArrayList<Empleado> listarTodosEmpleados(){
        ArrayList<Empleado> empleados = new ArrayList<>();       
        for (Sucursal e : this.suc.values()) {
            empleados.addAll(e.listarTodosEmpleados());
        }
        return empleados;
    }
    
    public boolean ingresarSuc(Sucursal s){
        if (this.suc.containsKey(s.getCiudad())) {
            return false;
        }else{
            this.suc.put(s.getCiudad(), s);
            return true;
        }
    }
    
    public ArrayList<Empleado> listarEmpleadosMayores(){
        ArrayList<Empleado> empleados = new ArrayList<>();       
        for (Sucursal e : this.suc.values()) {
            empleados.add(e.EmpleadoMayor());
        }
        return empleados;
    }

    public ArrayList<Sucursal> listarTodasSucursales(){
        ArrayList<Sucursal> sucursales = new ArrayList<>();       
        for (Sucursal e : this.suc.values()) {
            sucursales.add(e);
        }
        return sucursales;
    }
    public Sucursal listarSucursalMayorEmpleados(){
        Sucursal mayor = null;
        for (Sucursal s: this.suc.values()){
            if (mayor == null) mayor = s;
            else{
                if(s.getNumempleados() > mayor.getNumempleados())
                    mayor=s;
            }            
        }
        return mayor;
    }
}
