import java.util.LinkedList;
import java.util.Scanner;

public class enlazadalink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>();
        int opcion;

        do {
            System.out.println("\n=== MENÚ LISTA ENLAZADA ===");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número para agregar: ");
                    int valor = sc.nextInt();
                    lista.add(valor);
                    System.out.println("Elemento agregado correctamente.");
                    break;

                case 2:
                    System.out.print("Ingresa el número a eliminar: ");
                    int eliminar = sc.nextInt();
                    if (lista.remove((Integer) eliminar)) {
                        System.out.println("Elemento eliminado correctamente.");
                    } else {
                        System.out.println("Elemento no encontrado en la lista.");
                    }
                    break;

                case 3:
                    System.out.println("Contenido de la lista:");
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        for (int num : lista) {
                            System.out.print(num + " -> ");
                        }
                        System.out.println("null");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
