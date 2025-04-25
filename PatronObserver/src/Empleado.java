public class Empleado implements Observador{
    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje){
        System.out.printf("%s recibio mensaje: %s\n", this.nombre, mensaje);
    }
}
