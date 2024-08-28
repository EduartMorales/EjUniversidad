
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1061688186
 */
public class Universidad {
    //Atributos
    private String Nombre;
    private String Nit;
    private ArrayList<Estudiante>lsestudiantes;
    //Constructor no parametrizado
    public Universidad(){
        
    }
    //Constructor parametrizado

   
  

    public Universidad(String Nombre, String Nit, ArrayList<Estudiante> lsestudiantes) {
        this.Nombre = Nombre;
        this.Nit = Nit;
        this.lsestudiantes = lsestudiantes;
    }

     //Setters and Getters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public ArrayList<Estudiante> getLsestudiantes() {
        return lsestudiantes;
    }

    public void setLsestudiantes(ArrayList<Estudiante> lsestudiantes) {
        this.lsestudiantes = lsestudiantes;
    }
    
    
}
