public class Taco implements Comida{

    public String nombre;
    public float precio;

    @Override
    public void mostrar() {
        System.out.println("Taco disponible");
    }
}
