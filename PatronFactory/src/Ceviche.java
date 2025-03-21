public class Ceviche implements Comida{

    public String nombre;
    public float precio;

    @Override
    public void mostrar() {
        System.out.println("Ceviche disponible");
    }

}
