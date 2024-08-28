
package Logica_Cliente;
import Logica_Negocio.Universidad;
import Logica_Negocio.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 1061688186
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num_es;
        String nombre_es, identi;
        String nombre,nit;
        ArrayList<Estudiante> lsestudiantes = new ArrayList<>();
        Scanner scan = new Scanner (System.in);
        

        
        
        System.out.println("Digite el numero de estudiantes");
        num_es=scan.nextInt();
        
        for (int i = 0; i < num_es; i++) {
            System.out.println("Digite el nombre del estudiante");
            nombre_es=scan.next();
            
            System.out.println("Digite la identificacion del estudiante");
            identi=scan.next();
            
            Estudiante objEstudiante = new Estudiante(nombre_es, identi);
            lsestudiantes.add(objEstudiante);
        }
        
        System.out.println("Digite el nombre de la universidad");
        nombre=scan.next();
        
        System.out.println("Digite el nit de la universidad");
        nit=scan.next();
        
        Universidad objUniversidad= new Universidad(nombre, nit,lsestudiantes);
        
        System.out.println("El nombre de la universidad es"+"\t"+objUniversidad.getNombre());
        System.out.println("El nit de la universidad es"+"\t"+objUniversidad.getNit());
        
        for (int i = 0; i <objUniversidad.getLsestudiantes().size(); i++) {
            System.out.println("El nombre del estudiante es"+"\t"+objUniversidad.getLsestudiantes().get(i).getNombre());
            System.out.println("La identificacion del estudiante es"+"\t"+objUniversidad.getLsestudiantes().get(i).getIdentificacion());
        }
        
        }
    }
