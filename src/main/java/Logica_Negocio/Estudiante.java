
package Logica_Negocio;
import java.util.ArrayList;
/**
 *
 * @author 1061688186
 */
public class Estudiante {
    //Atributos
    private String Identificacion;
    private String Nombre;
    
    //Constructor 
    public Estudiante(){
        
    }
    
    //Constructor no parametrizado

    public Estudiante(String Identificacion, String Nombre) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
    }
    
    //Setters and Getters

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
