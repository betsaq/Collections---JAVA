// Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
//El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
//decide salir, se mostrará todos los perros guardados en el ArrayList.
//2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
//se mostrará la lista ordenada.
package Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Service {

    private String raza;

    Scanner leer = new Scanner(System.in);

    private final ArrayList<String> Perros = new ArrayList<>();

    public Service() {
    }

    public Service(String raza) {

        this.raza = raza;
    }

    public ArrayList<String> pedirRaza() {
        String opc;

        do {
            System.out.print("Ingrese la raza del perro: ");
            String raza = leer.nextLine();
            Perros.add(raza);
            for (String aux : Perros) {
                System.out.println(aux);
            }

            System.out.println("¿Quiere guardar otro perro o desea salir? S/N");
            opc = leer.nextLine();

        } while (opc.equals("S"));
        System.out.println("Los razas de perros guardadas son:");
        System.out.println(Perros);
        return Perros;

    }

    //2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
//se mostrará la lista ordenada.
    public void elijaPerro() {
        pedirRaza();
        Iterator<String> it = Perros.iterator();

        System.out.println("Elija una raza de perro a buscar en la lista: ");
        String perro_buscado = leer.nextLine();
        int bandera;
        while (it.hasNext()) {
            if (it.next().equals(perro_buscado)) { // Borro si está la palabra
                it.remove();

                bandera = +1;

                if (bandera == 1) {
                    System.out.println("La lista de razas actualizada es la siguiente: " + Perros);

                } else if (bandera != 1) {
                    System.out.println("El perro no se encuentra en la lista");
                    System.out.println("La lista de perros es: " + Perros);

                }

            }

        }
    }
}
