public class Pizza implements Comida{

    public String nombre;
    public float precio;

    @Override
    public void mostrar() {
        System.out.println("Pizza disponible");
    }

}
