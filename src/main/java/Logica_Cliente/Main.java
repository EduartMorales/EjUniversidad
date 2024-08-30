
package Logica_Cliente;
import Helpers.HelperValidacion;
import Logica_Negocio.Universidad;
import Logica_Negocio.Estudiante;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        int num_es = 0,rts,conteo;
        String nombre_es, identi;
        String nombre,nit;
        ArrayList<Estudiante> lsestudiantes = new ArrayList<>();
        Scanner scan = new Scanner (System.in);
       //Empieza el numero de estudiantes
        do {            
            try {
                System.out.println("Digite el numero de estudiantes");
                num_es = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error pelao");
            }
            scan.nextLine();
        } while (num_es <= 0);
       // System.out.println("Digite el numero de estudiantes");
        //num_es=scan.nextInt();
        
        //Termina el numero de estudiantes
        
        scan.nextLine();
        
        for (int i = 0; i < num_es; i++) {
            //Empieza el nombre
            System.out.println("Digite el nombre del estudiante");
            nombre_es=scan.nextLine();
            rts = HelperValidacion.ValidarVacio(nombre_es);
            
            while(rts > 0) {
                System.out.println("Digite el nombre del estudiante");
                nombre_es = scan.nextLine();
                rts = HelperValidacion.ValidarVacio(nombre_es);
            }
            
            conteo = HelperValidacion.ValidarTodo(nombre_es);
            
            while (conteo != 0) {
                System.out.println("Digite el nombre del estudiante");
                nombre_es = scan.nextLine();
                conteo = HelperValidacion.ValidarTodo(nombre_es);
            }
            
            //Termina el nombre
            //Empieza identificacion
            System.out.println("Digite la identificacion del estudiante");
            identi=scan.next();
            rts =HelperValidacion.ValidarTodoLetra(identi);
             scan.nextLine();
            while(rts > 0) {
                System.out.println("Digite la identificacion del estudiante");
                identi = scan.nextLine();
                rts = HelperValidacion.ValidarTodoLetra(identi);
            }
            
            conteo = HelperValidacion.ValidarTodoLetra(identi);
            
            while (conteo != 0) {
                System.out.println("Digite la identificaion");
                identi = scan.nextLine();
                conteo = HelperValidacion.ValidarTodoLetra(identi);
            }
            
            
            //Termona identificacion
            
            Estudiante objEstudiante = new Estudiante(nombre_es, identi);
            lsestudiantes.add(objEstudiante);
        }
                
        //Empieza nombre de la universidad
        System.out.println("Digite el nombre de la universidad");
        nombre=scan.next();
        rts = HelperValidacion.ValidarVacio(nombre);
             scan.nextLine();
            while(rts > 0) {
                System.out.println("Digite el nombre de la universidad");
                nombre = scan.nextLine();
                rts = HelperValidacion.ValidarVacio(nombre);
            }
            
            conteo = HelperValidacion.ValidarTodo(nombre);
            
            while (conteo != 0) {
                System.out.println("Digite el nombre de la universidad");
                nombre = scan.nextLine();
                conteo = HelperValidacion.ValidarTodo(nombre);
            }
            //Termina el nombre de la universidad
        
            //Empieza nit de la universidad
        System.out.println("Digite el nit de la universidad");
        nit=scan.next();
        rts =HelperValidacion.ValidarTodoLetra(nit);
             scan.nextLine();
            while(rts > 0) {
                System.out.println("Digite el nit de la universidad");
                nit = scan.nextLine();
                rts = HelperValidacion.ValidarTodoLetra(nit);
            }
            
            conteo = HelperValidacion.ValidarTodoLetra(nit);
            
            while (conteo != 0) {
                System.out.println("Digite el nit de la universidad");
                nit = scan.nextLine();
                conteo = HelperValidacion.ValidarTodoLetra(nit);
            }
        //Termina el nit de la universidad
        
        Universidad objUniversidad= new Universidad(nombre, nit,lsestudiantes);
        
        System.out.println("El nombre de la universidad es"+"\t"+objUniversidad.getNombre());
        System.out.println("El nit de la universidad es"+"\t"+objUniversidad.getNit());
        
        for (int i = 0; i <objUniversidad.getLsestudiantes().size(); i++) {
            System.out.println("El nombre del estudiante es"+"\t"+objUniversidad.getLsestudiantes().get(i).getNombre());
            System.out.println("La identificacion del estudiante es"+"\t"+objUniversidad.getLsestudiantes().get(i).getIdentificacion());
        }
        
        }
    }
