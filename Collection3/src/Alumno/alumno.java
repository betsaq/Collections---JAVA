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
package Alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class alumno {

    private static Iterator<String> iterator() {
        return null;
       
    }

    

    Scanner leer = new Scanner(System.in);
    private String nombre;
    private List<Integer> notas = new ArrayList<>(3);

    public alumno() {
    }

    public alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas= notas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    //Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
//nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
//Dentro del método se usará la lista notas para calcular el promedio final de alumno.
//Siendo este promedio final, devuelto por el método y mostrado en el main.
    public void notafinal() {
        int num = 0;
        int notafinal = 0;
        Iterator<String> it = alumno.iterator();
        System.out.println("Ingrese el nombre del alumno del cual quiere calcular su promedio");
        String alumno_buscado = leer.nextLine();

        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(alumno_buscado)) {

                System.out.println("Ingrese las notas del alumno: ");
                for (int i = 0; i < notas.size(); i++) {
                    notas.set(i, leer.nextInt());
                    int sumanotas = num + notas.get(i);

                    notafinal = sumanotas / 3;

                }

            }
            System.out.println("La nota final de " + alumno_buscado + " es: " + notafinal);

            //     } else (it.next().equalsIgnoreCase(alumno_buscado)) {
            //       System.out.println("El alumno no se encuentra registrado");
        }

    }

}
