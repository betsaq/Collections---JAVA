//Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
//tipo Integer con sus 3 notas.
//En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bluce tendremos el siguiente método en la clase Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
//nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
//Dentro del método se usará la lista notas para calcular el promedio final de alumno.
//Siendo este promedio final, devuelto por el método y mostrado en el main.
package collection3;

import Alumno.alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        alumno AL = new alumno();
        String opc;

        List<String> alumno = new ArrayList<>();
        

        do {
            System.out.println("Ingrese nombre del alumno");
            AL.setNombre(leer.nextLine());

            alumno.add(AL.getNombre());
            
          
                
            for (String aux : alumno) {
                System.out.println(aux);

            }

            System.out.println("¿Quiere guardar otro alumno? S/N");
            opc = leer.nextLine();

        } while (opc.equals("S"));
        System.out.println("Los alumnos guardados son:");
        System.out.println(alumno);

        AL.notafinal();

    }

}
