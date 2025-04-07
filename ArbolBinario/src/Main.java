public class Main {
    public static void main(String[] args) {
        System.out.println("Ejemplo arbol");
        Arbol arbol = new Arbol();
        arbol.agregar(123);
        arbol.agregar(95);
        arbol.agregar(150);
        arbol.agregar(180);
        arbol.agregar(160);
        arbol.ver();
    }
}