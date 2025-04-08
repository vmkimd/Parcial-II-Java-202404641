import java.util.Scanner;

// Clase principal donde se ejecuta todo paso por paso
public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner sc = new Scanner(System.in);

        // Paso 0: Cargar la lista inicial usando mi DPI: 3153821980502
        int[] dpi = {3, 1, 5, 3, 8, 2, 1, 9, 8, 0, 5, 0, 2};
        for (int valor : dpi) {
            lista.agregar(valor); // Agregamos cada dígito al final
        }

        System.out.println("Lista inicial creada con el DPI:");
        lista.imprimir();

        // Paso 1: Agregar el número 1 al inicio
        System.out.print("Ingrese el número que desea agregar al INICIO: ");
        int inicio = sc.nextInt();
        lista.agregarAlInicio(inicio);
        lista.imprimir();

        // Paso 2: Agregar el número 3 al final
        System.out.print("Ingrese el número que desea agregar al FINAL: ");
        int finalNum = sc.nextInt();
        lista.agregar(finalNum);
        lista.imprimir();

        // Paso 3: Agregar el número 5 en la posición 1
        System.out.print("Ingrese el número que desea agregar en la posición 1: ");
        int medio = sc.nextInt();
        lista.agregarEnPosicion(medio, 1);
        lista.imprimir();

        // Paso 4: Eliminar el número 3
        System.out.print("Ingrese el número que desea ELIMINAR: ");
        int eliminar = sc.nextInt();
        lista.eliminar(eliminar);
        lista.imprimir();

        // Paso 5: Agregar el número 7 al final
        System.out.print("Ingrese el número que desea agregar al FINAL nuevamente: ");
        int otroFinal = sc.nextInt();
        lista.agregar(otroFinal);
        lista.imprimir();

        // Paso 6 y 7: Verificar si contiene el número 5 y el número 9
        System.out.print("Ingrese un número para verificar si está en la lista (1): ");
        int buscar1 = sc.nextInt();
        System.out.println("¿Contiene el número " + buscar1 + "? " + lista.contiene(buscar1));

        System.out.print("Ingrese otro número para verificar si está en la lista (2): ");
        int buscar2 = sc.nextInt();
        System.out.println("¿Contiene el número " + buscar2 + "? " + lista.contiene(buscar2));

        // Paso 8: Invertir la lista
        System.out.println("Invirtiendo la lista...");
        lista.invertir();
        lista.imprimir();

        // Paso 9: Agregar el número 9 al inicio
        System.out.print("Ingrese el último número que desea agregar al INICIO: ");
        int ultimoInicio = sc.nextInt();
        lista.agregarAlInicio(ultimoInicio);
        lista.imprimir();

        sc.close();
    }
}
