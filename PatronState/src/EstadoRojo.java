public class EstadoRojo implements Estado{
    @Override
    public void cambiar(Semaforo semaforo){
        System.out.println("Color rojo\tFrene");
        semaforo.establecerEstado(new EstadoVerde());
    }
}
