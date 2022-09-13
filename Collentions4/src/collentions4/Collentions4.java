//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
//esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
//horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
//cuenta lo que se pide a continuación:
//En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//usuario todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
//quiere crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//en pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
//• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
package collentions4;

import java.util.ArrayList;
import java.util.Scanner;
import peliculas.peliculas;

public class Collentions4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        peliculas peli = new peliculas();
        String opc;
        ArrayList<peliculas> pelicula = new ArrayList();

        do {
            System.out.println("Ingrese el titulo de la pelicula");
            peli.setTitulo(leer.nextLine());
            System.out.println(peli.getTitulo());
            System.out.println("Ingrese el director de la pelicula");
            peli.setDirector(leer.nextLine());

            System.out.println("Ingrese la duracion de la pelicula");
            peli.setDuracion(leer.nextInt());

            System.out.println("Desea ingresar otra pelicula?? S/N");
            opc = leer.nextLine();

            pelicula.add(peli);
            
            
              for (peliculas aux : pelicula) {
                System.out.println(aux);}
        } while (opc.equals("S"));
          System.out.println("Las pelis guardadas son:");
        System.out.println(pelicula);

       
        
        
        
    }

}
