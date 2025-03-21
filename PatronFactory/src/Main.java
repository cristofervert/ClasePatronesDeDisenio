import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creacion de objetos"); // ejemplo de stream de output
        // Pizza c = new Pizza(); // evitamos la creacion de instancias de forma manual
        Factory f =  new Factory();
        Scanner s = new Scanner(System.in); // ejemplo de stream de input
        // System.err.println("Error"); // ejemplo de stream de error
        System.out.print("Ingrese una opcion ('a','b','c'): ");
        String valor = s.nextLine(); // para leer strings
        // s.nextInt() -> para leer ints
        Comida test = f.getInstance(valor);
        test.mostrar();
    }
}