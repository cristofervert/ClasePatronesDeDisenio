public class Main {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado("verde");
        Circulo cr1 = new Circulo("rojo");
        Cuadrado c2 = new Cuadrado("azul");
        c1.dibujar();
        System.out.println("______________________");
        Composito composito = new Composito();
        composito.agregar(c1);
        composito.agregar(cr1);
        composito.agregar(c2);
        composito.dibujar();
    }
}